package com.admaroc.tecdoc.controller;



import com.admaroc.tecdoc.services.Implementation.FtpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Controller
public class FtpController {

    @Autowired
    FtpServices ftpServices;

    @RequestMapping(value="/ftpPage",method = RequestMethod.GET)
    public String showFiles(Model model){

        if(ftpServices.connect("localhost",9999,"test1","test") == null)
        return "redirect:/welcomePage";
        else{
            model.addAttribute("ftpFiles",ftpServices.listAllFiles());
            model.addAttribute("ftpDirectories",ftpServices.listAllDirectories());
        return "ftpPage";
    }
    }
}
