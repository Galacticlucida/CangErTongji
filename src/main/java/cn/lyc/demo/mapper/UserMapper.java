package cn.lyc.demo.mapper;

import cn.lyc.demo.bean.User;

public interface UserMapper {
    int add(User user);
    User findOne(User user);
}