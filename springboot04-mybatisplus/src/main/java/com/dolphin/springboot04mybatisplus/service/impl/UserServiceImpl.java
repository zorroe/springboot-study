package com.dolphin.springboot04mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dolphin.springboot04mybatisplus.entity.User;
import com.dolphin.springboot04mybatisplus.mapper.UserMapper;
import com.dolphin.springboot04mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lxxx
 * @since 2022-11-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public List<User> findPage(int pageNum, int pageSize) {
        IPage<User> userPage = new Page<>(pageNum, pageSize);
        this.baseMapper.selectPage(userPage, null);
        List<User> records = userPage.getRecords();
        return records;
    }

    @Override
    public List<User> findUserDiff() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.gt(User::getAge, 18)
                .like(User::getEmail, "test")
                .lt(User::getAge, 25);
        List<User> users = this.baseMapper.selectList(wrapper);
        return users;
    }
}
