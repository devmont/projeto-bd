package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@Controller
@RestController(value = "/user")
public class UserResource {

    private final UserRepository userRepository;
    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path="/all")
    public Collection<User> getUsers() {
        return userRepository.findAll();
    }




}
