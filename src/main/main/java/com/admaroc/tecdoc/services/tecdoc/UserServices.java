package com.admaroc.tecdoc.services.tecdoc;

import com.admaroc.tecdoc.tecdoc.model.Role;
import com.admaroc.tecdoc.tecdoc.model.User;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author Ali Belemlih
 * Interface UserServices. Abstract methods for manipulation of entity User in database
 *
 * */

public interface UserServices {

    User findById(int Id);
    User findByName(String name);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUserById(int Id);
    List<User> findAllUsers();
    void deleteAllUsers();
    public boolean isUserExist(User user);
    void assignRole(User user,Role role);
    void assignRoles(User user,List<Role> roles);
    void deAssignRole(User user,Role role);
    String generateQRUrl(User user) throws UnsupportedEncodingException;
    public String generateOTPProtocol(String userName) ;





}
