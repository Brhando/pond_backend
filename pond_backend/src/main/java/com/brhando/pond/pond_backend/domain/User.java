package com.brhando.pond.pond_backend.domain;

import jakarta.persistence.*;

//relationship annotations go in entities
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @Column(unique = true) // needs to be unique, as it's used for login
    private String email;

    // constructors
    protected User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // getters/setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

}
