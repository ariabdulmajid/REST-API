package com.javadeveloper.rest.api.service;

import com.javadeveloper.rest.api.domain.Role;
import com.javadeveloper.rest.api.domain.User;

import java.util.List;

/**
 * @author Ari Abdul Majid
 * @version :$, (Created on 04/03/2023)
 * @since 1.0.Alpha1
 */
public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
