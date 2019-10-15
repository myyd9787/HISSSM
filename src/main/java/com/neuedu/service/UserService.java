package com.neuedu.service;

import com.neuedu.pojo.User;

public interface UserService {
    /**
     * 登录验证
     * @return User对象
     *
     */
    public User login(User user) throws Exception;

}
