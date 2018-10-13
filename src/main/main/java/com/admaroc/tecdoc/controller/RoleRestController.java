package com.admaroc.tecdoc.controller;

import com.admaroc.tecdoc.exception.CustomErrorType;
import com.admaroc.tecdoc.exception.UserNotFoundException;
import com.admaroc.tecdoc.model.Role;
import com.admaroc.tecdoc.services.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class RoleRestController {


    @Autowired
    RoleServices roleServices;

    @RequestMapping(value="/roles", method = RequestMethod.GET)
    public List<Role> listAllRoles() {
        List<Role> roles = roleServices.findAllRoles();
        if(roles.isEmpty()){
            throw new UserNotFoundException("error message");

        }
        return roles;
    }

    @RequestMapping(value="/roles", method = RequestMethod.POST)
    public ResponseEntity<Void> createRole(@RequestBody Role role, UriComponentsBuilder ucBuilder){

        if (roleServices.isRoleExist(role)) {

            return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " +
                    role.getName() + " already exist."), HttpStatus.CONFLICT);
        }
        roleServices.saveRole(role);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/role/{id}").buildAndExpand(role.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);

    }

    @RequestMapping(value = "/roles/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateRole(@PathVariable("id") int id, @RequestBody Role role) {

        Role currentRole = roleServices.findById(id);

        if (currentRole == null) {

            return new ResponseEntity(new CustomErrorType("Unable to upate. Role with id " + id + " not found."),
                    HttpStatus.NOT_FOUND);
        }

        currentRole.setName(role.getName());
        currentRole.setDescription(role.getDescription());

        roleServices.updateRole(currentRole);
        return new ResponseEntity<Role>(currentRole, HttpStatus.OK);
    }

    @RequestMapping(value = "/roles/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Role> deleteRole(@PathVariable("id") int id) {

        Role role = roleServices.findById(id);
        if (role == null) {
            System.out.println("Unable to delete. Role with id " + id + " not found");
            return new ResponseEntity<Role>(HttpStatus.NOT_FOUND);
        }

        roleServices.deleteRole(id);
        return new ResponseEntity<Role>(HttpStatus.NO_CONTENT);
    }
}
