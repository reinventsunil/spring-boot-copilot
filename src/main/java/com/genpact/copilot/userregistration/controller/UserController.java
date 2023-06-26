package com.genpact.copilot.userregistration.controller;

import com.genpact.copilot.userregistration.model.User;
import com.genpact.copilot.userregistration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{userId}")
    public User getUser(Long userId) {
        return userService.getUser(userId);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }
    @PostMapping("/user")
    public void saveUser(User user) {
        userService.save(user);
    }

    @DeleteMapping("/user/{userId}")
    public void deleteUser(Long userId) {
        userService.deleteUser(userId);
    }

}
