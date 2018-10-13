package com.admaroc.tecdoc.repository;

import com.admaroc.tecdoc.model.User;
import com.admaroc.tecdoc.model.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Ali Belemlih
 * Interface UserLogRepository. Allows CRUD operations on entity UserLog in database
 * */

@Repository
public interface UserLogRepository extends JpaRepository<UserLog,Integer> {

    UserLog findUserLogByName(String user);

}
