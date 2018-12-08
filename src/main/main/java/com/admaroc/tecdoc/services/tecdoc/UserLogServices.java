package com.admaroc.tecdoc.services.tecdoc;

import com.admaroc.tecdoc.tecdoc.model.User;
import com.admaroc.tecdoc.tecdoc.model.UserLog;

import java.util.List;

/**
 * @author Ali Belemlih
 * Interface UserLogServices. Abstract methods for manipulation of entity Privilege in database
 *
 * */

public interface UserLogServices {

    UserLog findById(int id);
    UserLog findByUser(User user);
    void saveUserLog(UserLog userLog);
    void deleteUserLog(int id);
    void deleteAllLogs();
    List<UserLog> findAllLogs();
    boolean isLogExist(UserLog userLog);
}
