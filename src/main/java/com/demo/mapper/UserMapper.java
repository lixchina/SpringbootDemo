package com.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.demo.entity.User;

@Mapper
public interface UserMapper {
    List<User> selectAll();
}

