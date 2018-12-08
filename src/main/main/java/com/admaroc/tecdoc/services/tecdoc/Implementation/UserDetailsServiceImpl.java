package com.admaroc.tecdoc.services.tecdoc.Implementation;


import com.admaroc.tecdoc.tecdoc.model.User;
import com.admaroc.tecdoc.tecdoc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Implementation of UserDetailsService for spring security. Loads Current Logged user
 */

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

        User user = userRepository.findByName(name);

        if(user==null) {throw new UsernameNotFoundException("No such user: " + name);
        } else if (user.getRoles().isEmpty()) {
            throw new UsernameNotFoundException("User " + name + " has no authorities");
        }
        UserDetailsAdapter userToAdapt = new UserDetailsAdapter(user);
        return userToAdapt;
    }

}


