package com.admaroc.tecdoc.tecdoc.model;

import java.util.List;

public class PrivilegeWrapper {

    private List<Privilege> privileges;
    private List<String> privilegeList;

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }

    public List<String> getPrivilegeList() {
        return privilegeList;
    }

    public void setPrivilegeList(List<String> privilegeList) {
        this.privilegeList = privilegeList;
    }
}
