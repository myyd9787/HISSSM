package com.neuedu.controller;

import com.neuedu.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @RequestMapping("/registerList.action")
    public String getRegisterByState(Model model){
        model.addAttribute("registerList", doctorService.getRegisterByState(1,1,10));
        return "doctor/registerList";
    }
}
