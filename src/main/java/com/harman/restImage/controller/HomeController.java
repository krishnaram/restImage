package com.harman.restImage.controller;

import com.harman.restImage.dal.UserDAL;
import com.harman.restImage.dal.UserRepository;
import com.harman.restImage.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HomeController {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final UserDAL userDAL;

    public HomeController(UserRepository userRepository, UserDAL userDAL) {
        this.userRepository = userRepository;
        this.userDAL = userDAL;
    }
    @GetMapping(value = "/",produces = MediaType.TEXT_PLAIN_VALUE)
    public String index(){
        return "Home page";
    }

    @PostMapping(value = "/create")
    public User addNewUsers(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping(value = "/{userId}")
    public Optional<User> getUser(@PathVariable String userId) {
        return userRepository.findById(userId);
    }
}

