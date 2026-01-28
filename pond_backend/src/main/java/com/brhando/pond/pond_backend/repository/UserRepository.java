package com.brhando.pond.pond_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.brhando.pond.pond_backend.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //derived queries go in the repository layer
    Optional<User> findByEmail(String email);

    Iterable<User> findByName(String name);
}
