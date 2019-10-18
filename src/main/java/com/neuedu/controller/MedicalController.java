package com.neuedu.controller;

import com.neuedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/medical")
public class MedicalController {
    @Autowired
    private UserService userService;
    @RequestMapping("/toCheckPatient.action")
    public String toCheckPatient(){return "medical/checkPatient";}
}
