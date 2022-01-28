package com.taskagile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.taskagile.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired 
    private UserRepository userRepository; 

    @GetMapping

}
