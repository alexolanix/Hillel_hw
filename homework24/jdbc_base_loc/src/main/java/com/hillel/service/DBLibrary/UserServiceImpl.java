package com.hillel.service.DBLibrary;

import com.hillel.db.DbWork;
import com.hillel.entity.User;
import com.hillel.service.UserService;

public class UserServiceImpl implements UserService {
    private DbWork base;;
    public UserServiceImpl(){
        base = new DbWork();
    }

    @Override
    public User findUser(String username) {
        return getWork().findUserByUsername(username);
    }

    public DbWork getWork() {
        return base;
    }
}
