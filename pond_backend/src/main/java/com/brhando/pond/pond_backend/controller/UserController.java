package com.brhando.pond.pond_backend.controller;

import com.brhando.pond.pond_backend.domain.User;
import com.brhando.pond.pond_backend.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    public UserController(UserService userService) {
        this.service = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/by-email")
    public Optional<User> getByEmail(@RequestParam String email) {
        return service.getByEmail(email);
    }

    @GetMapping("/by-name")
    public Iterable<User> getByName(@RequestParam String name) {
        return service.getByName(name);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }
}
