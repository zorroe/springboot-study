package com.dolphin.springboot04mybatisplus.mapper;

import com.dolphin.springboot04mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lxxx
 * @since 2022-11-22
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
