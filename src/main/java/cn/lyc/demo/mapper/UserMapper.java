package cn.lyc.demo.mapper;

import cn.lyc.demo.bean.User;
import org.springframework.context.annotation.Bean;

public interface UserMapper {

    public User getUserByAccount(String account);
    public void insertUser(User user);
}
