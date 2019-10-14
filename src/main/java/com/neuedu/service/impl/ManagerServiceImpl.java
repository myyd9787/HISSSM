package com.neuedu.service.impl;

import com.neuedu.mapper.UserMapper;
import com.neuedu.pojo.User;
import com.neuedu.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private UserMapper userMapper;
    //登录验证
    public User login(User user) throws Exception {
        return userMapper.login(user);
    }
}
