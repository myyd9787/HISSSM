package com.neuedu.controller;

import com.neuedu.pojo.User;
import com.neuedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/Welcome.action")
    public String toWelcome(){
        return "Welcome";
    }

    //跳转登录页
    @RequestMapping("/toLogin.action")
    public String toLogin(){
        return "Login";
    }

    //执行登录
    @RequestMapping("/login.action")
    public @ResponseBody String login(HttpSession session, @RequestBody User user) throws Exception {
        User loginUser = userService.login(user.getUserName(), user.getPassword());

        if (loginUser!=null&&
                loginUser.getUserName().equals(user.getUserName())&&
                loginUser.getPassword().equals(user.getPassword())){
            if (loginUser.getUseType()==1){
                return "Admin";
            }else if (loginUser.getUseType()==2){
                return "GuaHaoYuan";
            }else if (loginUser.getUseType()==3){
                return "Doctor";
            }else if (loginUser.getUseType()==4){
                return "Tech";
            }else if (loginUser.getUseType()==5){
                return "Drug";
            }else if (loginUser.getUseType()==6){
                return "Finance";
            }else{
                return null;
            }
        }else{
            return null;
        }
    }

    @RequestMapping("/Admin.action")
    public String toAdmin(){
        return "Admin";
    }

    @RequestMapping("/GuaHaoYuan.action")
    public String toGuaHaoYuan(){
        return "GuaHaoYuan";
    }

    @RequestMapping("/Doctor.action")
    public String toDoctor(){
        return "Doctor";
    }

    @RequestMapping("/Tech.action")
    public String toTech(){
        return "Tech";
    }

    @RequestMapping("/Drug")
    public String toDrug(){
        return "Drug";
    }

    @RequestMapping("/Finance")
    public String toFinance(){
        return "Finance";
    }


}
