package com.admaroc.tecdoc.controller;

import com.admaroc.tecdoc.tecdoc.model.FormView;
import com.admaroc.tecdoc.tecdoc.model.User;

import com.admaroc.tecdoc.services.tecdoc.PrivilegeServices;
import com.admaroc.tecdoc.services.tecdoc.RoleServices;
import com.admaroc.tecdoc.services.tecdoc.UserLogServices;
import com.admaroc.tecdoc.services.tecdoc.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

