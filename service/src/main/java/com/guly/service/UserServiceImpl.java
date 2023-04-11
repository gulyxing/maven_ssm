package com.guly.service;

import com.guly.dao.userMapper;
import com.guly.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private userMapper um;

    @Override
    public User find(Integer id) {
        User user = um.find(id);
        return user;
    }
}
