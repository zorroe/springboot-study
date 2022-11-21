package com.dolphin.springboot03mybatis.service;

import com.dolphin.springboot03mybatis.entity.User;

public interface UserService {
    int insert(User user);

    int update(User user);

    User findById(String id);

}
