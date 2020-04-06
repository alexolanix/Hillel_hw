package com.hillel.service;

import com.hillel.entity.User;

public interface UserService {
    User findUser(String username);
}
