package com.admaroc.tecdoc.services.Implementation;

import com.admaroc.tecdoc.model.Role;
import com.admaroc.tecdoc.model.User;
import com.admaroc.tecdoc.repository.RoleRepository;
import com.admaroc.tecdoc.repository.UserRepository;
import com.admaroc.tecdoc.services.UserServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ali Belemlih
 * Implementation of Interface UserServices. Provides implementation of methods for manipulation of entity User in database
 *
 * */

@Service
@Transactional
public class UserServicesimpl implements UserServices {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;


    public static String QR_PREFIX = "https://chart.googleapis.com/chart?chs=200x200&chld=M%%7C0&cht=qr&chl=";
    public static String APP_NAME = "Tecdoc";

    /**
     * Finds a User in DB
     * @param Id
     * @return User
     */
    @Override
    public User findById(int Id) {
        List<User> users = userRepository.findAll();
        for(User user : users){
            if(user.getId() == Id){
                return user;
            }
        }
        return null;
    }

    /**
     * Assign Role to User
     * @param user
     * @param role
     */
    @Override
    public void assignRole(User user, Role role) {

        List<Role> roleToAssign=user.getRoles();

        if(!roleToAssign.contains(role))
        {
            System.out.println(role.getName());
            roleToAssign.add(role);
            user.setRoles(roleToAssign);
            updateUser(user);
        }

    }

    /**
     * Assigns a list of roles to User
     * @param user
     * @param roles
     */
    @Override
    public void assignRoles(User user, List<Role> roles) {
        for (Role tmp : roles) {
            assignRole(user,tmp);
        }
    }

    /**
     * Removes a role from a user
     * @param user
     * @param role
     */
    @Override
    public void deAssignRole(User user, Role role) {
        List<Role> roleOfUser= roleRepository.findByUsers(user);

        List<Role> roles=new ArrayList<>();

        for(Role rol:roleOfUser)
        {
            if(rol.getId()!=role.getId())
            {
                roles.add(rol);
            }
        }


        user.setRoles(roles);
        saveUser(user);

    }


    @Override
    public String generateOTPProtocol(String userName) {

            User user = userRepository.findByName(userName);
            return String.format("otpauth://totp/%s:%s?secret=%s&issuer=SpringBootTOTP", userName, userName + "@domain.com", user.getSecret());

    }

    @Override
    public String generateQRUrl(User user) throws UnsupportedEncodingException {
        return QR_PREFIX + URLEncoder.encode(String.format("otpauth://totp/%s:%s?secret=%s&issuer=%s", APP_NAME, user.getName(), user.getSecret(), APP_NAME), "UTF-8");

    }

    /**
     * Finds a User by his name
     * @param name
     * @return user
     */

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    /**
     * Saves a User in database
     * @param user
     */

    @Override
    public void saveUser(User user) {


        userRepository.save(user);
        assignRole(user,roleRepository.findByName("ROLE_USER"));
    }

    /**
     * Updates a User in database
     * @param user
     */

    @Override
    public void updateUser(User user) {

        User userToUpdate=user;
        userToUpdate.setId(user.getId());
        userRepository.save(userToUpdate);

    }

    /**
     * Deletes a User from database
     * @param Id
     */
    @Override
    public void deleteUserById(int Id) {
       userRepository.delete(findById(Id));

    }

    /**
     * return a list of all users currently in database
     * @return List<User>
     */
    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteAllUsers() {

    }

    /**
     * returns true if user exist and false if user doesn't exist
     * @param user
     * @return boolean
     */
    @Override
    public boolean isUserExist(User user) {
        return findById(user.getId())!=null;
    }
}
