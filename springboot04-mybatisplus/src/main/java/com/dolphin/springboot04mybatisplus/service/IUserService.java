package com.dolphin.springboot04mybatisplus.service;

import com.dolphin.springboot04mybatisplus.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lxxx
 * @since 2022-11-22
 */
public interface IUserService extends IService<User> {

    List<User> findPage(int pageNum, int pageSize);

    List<User> findUserDiff();

}
