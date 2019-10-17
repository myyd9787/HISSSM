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

    //验证是否登录

    //跳转欢迎页
    @RequestMapping("/toWelcome.action")
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
        User loginUser = userService.login(user);
        session.setAttribute("useType", user.getUseType());
        if (loginUser!=null&&
                loginUser.getUseType().equals(user.getUseType())){
            if (loginUser.getUseType()==1){
                return "Admin";
            }else if (loginUser.getUseType()==2){
                return "Regist";
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

    //跳转管理员
    @RequestMapping("/toAdmin.action")
    public String toAdmin(){
        return "Admin";
    }

    //跳转挂号员
    @RequestMapping("/toRegist.action")
    public String toRegist(){
        return "Regist";
    }

    //跳转医生
    @RequestMapping("/toDoctor.action")
    public String toDoctor(){
        return "doctor/Doctor";
    }

    //跳转医生技师
    @RequestMapping("/toTech.action")
    public String toTech(){
        return "Tech";
    }

    //跳转药管理
    @RequestMapping("/toDrug.action")
    public String toDrug(){
        return "Drug";
    }

    //跳转财务管理
    @RequestMapping("/toFinance.action")
    public String toFinance(){
        return "Finance";
    }


}
