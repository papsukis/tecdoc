package com.admaroc.tecdoc.repository;


import com.admaroc.tecdoc.model.Role;
import com.admaroc.tecdoc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author Ali Belemlih
 * Interface UserRepository. Allows CRUD operations on entity User in database
 * */


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByName(String name);
    List<User> findByRoles(Role role);

}
