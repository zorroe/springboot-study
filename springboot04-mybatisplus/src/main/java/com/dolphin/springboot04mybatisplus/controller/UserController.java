package com.dolphin.springboot04mybatisplus.controller;

import com.dolphin.springboot04mybatisplus.entity.User;
import com.dolphin.springboot04mybatisplus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lxxx
 * @since 2022-11-22
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") String id) {
        User user = userService.getById(id);
        return user;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public boolean deleteById(@PathVariable("id") String id) {
        boolean result = userService.removeById(id);
        return result;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public boolean insert(@RequestBody User user) {
        boolean result = userService.save(user);
        return result;
    }

    @RequestMapping(value = "/findpage/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public List<User> findUserPage(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        List<User> users = userService.findPage(pageNum,pageSize);
        return users;
    }

    /**
     * 复杂查询
     * @return
     */
    @RequestMapping(value = "/find/diff",method = RequestMethod.GET)
    public List<User> findUser(){
        List<User> users = userService.findUserDiff();
        return users;
    }

}
