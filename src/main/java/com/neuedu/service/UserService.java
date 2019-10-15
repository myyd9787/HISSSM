package com.neuedu.service;

import com.neuedu.pojo.User;

public interface UserService {
    /**
     * 登录验证
     * @param userName 用户名
     * @param password 密码
     * @return User对象
     *
     */
    public User login(String userName, String password) throws Exception;
}
