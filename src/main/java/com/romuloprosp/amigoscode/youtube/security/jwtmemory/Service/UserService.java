package com.romuloprosp.amigoscode.youtube.security.jwtmemory.Service;

import java.util.List;

import com.romuloprosp.amigoscode.youtube.security.jwtmemory.Entity.Role;
import com.romuloprosp.amigoscode.youtube.security.jwtmemory.Entity.User;

import org.springframework.stereotype.Service;
@Service
public interface UserService {
    //Define all methods needed in the application
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String rolename);
    User getUser(String username);
    List<User>getUsers();  // in real world, this just return a page of users, bacause could exist 500,000 users
}
