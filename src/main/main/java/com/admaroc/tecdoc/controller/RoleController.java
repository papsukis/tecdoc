package com.admaroc.tecdoc.controller;

import com.admaroc.tecdoc.model.Role;
import com.admaroc.tecdoc.services.PrivilegeServices;
import com.admaroc.tecdoc.services.RoleServices;
import com.admaroc.tecdoc.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RoleController {

    @Autowired
    UserServices userServices;
    @Autowired
    RoleServices roleServices;
    @Autowired
    PrivilegeServices privilegeServices;

    @RequestMapping(value="/rolePage",method = RequestMethod.GET)
    public String getAllRoles(Model model){


        model.addAttribute("role", new Role());
        model.addAttribute("roles",roleServices.findAllRoles());
        return "rolePage";
    }

    @RequestMapping(value = { "/addRole" }, method = RequestMethod.GET)
    public String saveRole(Model model) {

        model.addAttribute("role",new Role());
        model.addAttribute("allprivileges",privilegeServices.findAllPrivileges());


        return "addRole";

    }

    @RequestMapping(value = { "/saveRole" }, method = RequestMethod.POST)
    public String saveUser(Model model, @ModelAttribute("Role") Role role) {


        roleServices.saveRole(role);

        return "redirect:/rolePage";
    }

    @RequestMapping(value = { "/updateRole/{id}" }, method = RequestMethod.GET)
    public String saveUser(Model model,@PathVariable("id") int id) {

        model.addAttribute("role",roleServices.findById(id));
        model.addAttribute("privileges",privilegeServices.findAllPrivileges());

        return "updateRole";
    }
    @RequestMapping(value = { "/updateRole" }, method = RequestMethod.POST)
    public String updateUser(Model model,@ModelAttribute("role") Role role) {

        roleServices.updateRole(role);

        return "redirect:/rolePage";
    }

    @RequestMapping(value="/deleteRole", method = RequestMethod.GET)
    public String deleteRole (@RequestParam("id") int id) {

        roleServices.deleteRole(id);

        return "redirect:/rolePage";
    }
}
