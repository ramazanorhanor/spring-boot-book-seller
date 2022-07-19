package com.sha.springBootBookSeller_6_7_2022.service;

import com.sha.springBootBookSeller_6_7_2022.model.User;

import java.util.Optional;

public interface IUserService {
    public User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
