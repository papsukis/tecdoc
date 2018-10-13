package com.admaroc.tecdoc.repository;


import com.admaroc.tecdoc.model.Privilege;
import com.admaroc.tecdoc.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author Ali Belemlih
 * Interface PrivilegeRepository. Allows CRUD operations on entity Privilege in database
 * */

@Repository
public interface PrivilegeRepository extends JpaRepository<Privilege,Integer>{

    Privilege findByName(String name);
    List<Privilege> findByRoles(Role role);
}
