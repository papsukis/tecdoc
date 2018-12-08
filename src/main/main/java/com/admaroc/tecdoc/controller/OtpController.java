package com.admaroc.tecdoc.controller;

import com.admaroc.tecdoc.tecdoc.model.FormView;
import com.admaroc.tecdoc.tecdoc.model.User;
import com.admaroc.tecdoc.services.tecdoc.QrService;
import com.admaroc.tecdoc.services.tecdoc.RoleServices;
import com.admaroc.tecdoc.services.tecdoc.UserServices;
import com.google.zxing.WriterException;
import main.java.org.jboss.aerogear.security.otp.Totp;
import main.java.org.jboss.aerogear.security.otp.api.Base32;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.net.URI;

@Controller
@RequestMapping("/code")
public class OtpController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OtpController.class);


    @Autowired
    UserServices userServices;
    @Autowired
    RoleServices roleServices;
    @Autowired
    QrService qrService;

    public static String QR_PREFIX = "https://chart.googleapis.com/chart?chs=200x200&chld=M%%7C0&cht=qr&chl=";
    public static String APP_NAME = "Tecdoc";
    public static String error="qr code did not charge";


    @RequestMapping(method = RequestMethod.GET)
    public String showVerificationCodeForm(Model model,@ModelAttribute FormView name) throws Exception {

        User user=userServices.findByName(name.getForm());
        if(user!=null){
            if(user.getSecret()==null) {
                user.setSecret(Base32.random());
            }

            Totp totp = new Totp(user.getSecret());

            String qrcode;

            URI uri = new URI("otpauth", "totp", "/" + APP_NAME + ":" + name.getForm(), "secret=" + user.getSecret() + "&issuer=" + APP_NAME,null);
            String URI=uri.toASCIIString();

            model.addAttribute("code",new FormView());
            try {
                    model.addAttribute("qrCode",qrService.byteToString(qrService.generateQRCode(URI, 256, 256)));
                } catch (WriterException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
            }

            return "code";
        }

        return "redirect:/login";
    }
}
