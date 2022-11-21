package com.dolphin.springboot03mybatis.service.impl;

import com.dolphin.springboot03mybatis.entity.User;
import com.dolphin.springboot03mybatis.mapper.UserMapper;
import com.dolphin.springboot03mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        int result = userMapper.insert(user);
        return result;
    }

    @Override
    public int update(User user) {
        int result = userMapper.update(user);
        return result;
    }

    @Override
    public User findById(String id) {
        User user = userMapper.selectById(id);
        return user;
    }
}
