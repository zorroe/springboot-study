package com.dolphin.springboot03mybatis.controller;

import com.dolphin.springboot03mybatis.entity.User;
import com.dolphin.springboot03mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public int insert(@RequestBody User user){
        int result = userService.insert(user);
        return result;
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public int update(@RequestBody User user){
        int result = userService.update(user);
        return result;
    }

    @RequestMapping(value = "/find/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id") String id){
        User user = userService.findById(id);
        return user;
    }
}
