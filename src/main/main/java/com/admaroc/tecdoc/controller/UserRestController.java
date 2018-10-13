package com.admaroc.tecdoc.controller;

import com.admaroc.tecdoc.services.RoleServices;
import com.admaroc.tecdoc.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @Autowired
    UserServices userServices;
    @Autowired
    RoleServices roleServices;

/*

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public List<User> listAllUsers() {
        List<User> users = userServices.findAllUsers();
        if(users.isEmpty()){
            throw new UserNotFoundException("error message");

        }
        return users;
    }

    @RequestMapping(value="/user/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUser(@PathVariable("id") int id) {

        User user = userServices.findById(id);
        if (user == null) {

            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {


        if (userServices.isUserExist(user)) {

            return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " +
                    user.getName() + " already exist."),HttpStatus.CONFLICT);
        }
        userServices.saveUser(user);
        //userServices.assignRole(user,roleServices.findByName("ROLE_USER"));

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/user/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);

    }
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable("id") int id, @RequestBody User user) {

        User currentUser = userServices.findById(id);

        if (currentUser == null) {

            return new ResponseEntity(new CustomErrorType("Unable to upate. User with id " + id + " not found."),
                    HttpStatus.NOT_FOUND);
        }

        currentUser.setName(user.getName());
        currentUser.setEmail(user.getEmail());
        currentUser.setLogged(user.getLogged());
        currentUser.setPassword(user.getPassword());
        currentUser.setUsual_IP(user.getUsual_IP());


        userServices.updateUser(currentUser);
        return new ResponseEntity<User>(currentUser, HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUser(@PathVariable("id") int id) {

        User user = userServices.findById(id);
        if (user == null) {
            System.out.println("Unable to delete. User with id " + id + " not found");
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }

        userServices.deleteUserById(id);
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value="/users/{id}/role/{role_id}",method = RequestMethod.PUT)
    public ResponseEntity<?> assignRole(@PathVariable("role_id") int id,@PathVariable("id") int Id)//, @RequestBody Role role)
    {
        User user = userServices.findById(Id);
        if(user == null){
            return new ResponseEntity(new CustomErrorType("Unable to update. User with id " + id + " not found."),
                    HttpStatus.NOT_FOUND);
        }
        userServices.assignRole(user,roleServices.findById(id));

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @RequestMapping(value="/users/{id}/role/{role_id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> DeAssignRole(@PathVariable("role_id") int id,@PathVariable("id") int Id)
    {
        User user = userServices.findById(Id);
        if(user == null){
            return new ResponseEntity(new CustomErrorType("Unable to update. User with id " + id + " not found."),
                    HttpStatus.NOT_FOUND);
        }
        userServices.deAssignRole(user,roleServices.findById(id));

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }*/
}
