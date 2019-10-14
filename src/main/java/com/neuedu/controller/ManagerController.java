package com.neuedu.controller;

import com.neuedu.pojo.User;
import com.neuedu.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    private ManagerService managerService;
    @RequestMapping("/login.action")
    public String login(User user) throws Exception {
        User user1=managerService.login(user);
        //如果登录框中的用户名和密码与数据库中的数据一致，直接跳转到index界面
        if(user1.getUserName().equals(user.getUserName())&&user1.getPassword().equals(user.getPassword())){
            return "manager/index5.html";
        }else{
            return null;
        }
    }
}
