package com.admaroc.tecdoc.controller;

import com.admaroc.tecdoc.model.FormView;
import com.admaroc.tecdoc.model.FtpClient;
import com.admaroc.tecdoc.model.User;

import com.admaroc.tecdoc.services.PrivilegeServices;
import com.admaroc.tecdoc.services.RoleServices;
import com.admaroc.tecdoc.services.UserLogServices;
import com.admaroc.tecdoc.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.IOException;

@Controller
public class MainController {

    @Autowired
    UserServices userServices;
    @Autowired
    RoleServices roleServices;
    @Autowired
    PrivilegeServices privilegeServices;
    @Autowired
    UserLogServices userLogServices;


    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcomePage(Model model) {


        /*FtpClient client=new FtpClient("localhost",9999,"test","test");//ftpServices.connect("ftp://speedtest.tele2.net/","anonymous","ftp4j");
        File file= new File("C:\\Users\\c\\Documents\\test.txt");

        try {
            client.open();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*try {
            client.putFileToPath(file,"/test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
       /* try {
            client.downloadFile("/test.txt","C:\\Users\\c\\Documents\\ftpDownload\\test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

       /* try {
            client.connect("localhost");
            client.login("test","test");
            System.out.println("succesfully conected to ftp server");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FTPIllegalReplyException e) {
            e.printStackTrace();
        } catch (FTPException e) {
            e.printStackTrace();
        }
        if(client!= null)
        {

        }*/
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is welcome page!");
        return "welcomePage";
    }

    @RequestMapping(value = "/adminPage", method = RequestMethod.GET)
    public String adminPage(Model model, User user) {

        org.springframework.security.core.Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User logedUser = userServices.findByName(auth.getName());

        String userInfo = logedUser.toString();
        model.addAttribute("userInfo", userInfo);

        return "adminPage";
    }

    @GetMapping(value="/index")
    public String showIndex(Model model)
    {
        //Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        //User logedUser = userServices.findByName(auth.getName());

        //model.addAttribute("user",logedUser);
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {

        model.addAttribute("name", new FormView());

        return "loginPage";
    }

    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "logoutSuccessfulPage";
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo(Model model, User user) {

        // After user login successfully.
        String userName = user.getName();

        System.out.println("User Name: " + userName);

        org.springframework.security.core.Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User logedUser = userServices.findByName(auth.getName());

        String userInfo = logedUser.toString();
        model.addAttribute("userInfo", userInfo);
        model.addAttribute("users", userServices.findAllUsers());
        return "userInfoPage";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(Model model, User user) {

        if (user != null) {
            User logedUser = user;

            String userInfo = user.toString();

            model.addAttribute("userInfo", userInfo);

            String message = "Hi " + user.getName() //
                    + "<br> You do not have permission to access this page!";
            model.addAttribute("message", message);

        }

        return "403Page";
    }


}

