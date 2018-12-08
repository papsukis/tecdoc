package com.admaroc.tecdoc.tecdoc.model;

import com.admaroc.tecdoc.services.tecdoc.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RolesWrapper{
    private List<Role> roles;
    private List<String> listRoles;

    public RolesWrapper(List<Role> roles) {
        this.roles = roles;
    }

    public RolesWrapper() {

    }

    public RolesWrapper(List<Role> roles, List<String> listRoles) {

        this.roles = roles;
        this.listRoles = listRoles;
    }

    @Autowired
    RoleServices roleServices;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "RolesWrapper{" +
                "roles=" + roles +
                '}';
    }

    public void showRoles() {
        for (int i = 0; i < listRoles.size(); i++) {
            System.out.println(listRoles.get(i));
        }
    }

    public List<String> getListRoles() {
        return listRoles;
    }

    public void setListRoles(List<String> listRoles) {
        this.listRoles = listRoles;
    }



}
