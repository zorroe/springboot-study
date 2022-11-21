package com.dolphin.springboot03mybatis.mapper;

import com.dolphin.springboot03mybatis.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Insert("insert into user(name,age,email) values (#{name},#{age},#{email})")
    int insert(User user);

    @Update("update user set name=#{name},age=#{age},email=#{email} where id=#{id}")
    int update(User user);

    @Select("select *  from user where id=#{id}")
    @Results(id = "user", value = {
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "age", column = "age", javaType = Integer.class),
            @Result(property = "email", column = "email", javaType = String.class)
    })
    User selectById(String id);
}
