package com.brhando.pond.pond_backend.service;

import org.springframework.stereotype.Service;
import com.brhando.pond.pond_backend.domain.User;
import com.brhando.pond.pond_backend.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User createUser(User user) {
        return repo.save(user);
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

}
