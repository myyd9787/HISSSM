package com.neuedu.service.impl;

import com.neuedu.mapper.UserMapper;
import com.neuedu.pojo.User;
import com.neuedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 登录验证
     * @return User对象
     *
     */
    public User login(User user) throws Exception {
        return userMapper.login(user);
    }
}
