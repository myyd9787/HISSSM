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
     * @param userName 用户名
     * @param password 密码
     * @return User对象
     *
     */
    public User login(String userName, String password) throws Exception {
        //将前端传递来的数据封装到User对象中
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        return userMapper.login(user);
    }
}
