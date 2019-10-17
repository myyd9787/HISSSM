package com.neuedu.controller;

import com.neuedu.pojo.PageBean;
import com.neuedu.pojo.Register;
import com.neuedu.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @RequestMapping("/medicalHistory.action")
    public String toMedicalHistory(){
        return "doctor/medicalHistory";
    }

    @RequestMapping(value = "/getRegisterByState.action", params = {"state", "page", "limit"})
    public @ResponseBody PageBean<Register> getRegisterByState0(int state, int page, int limit){
        int startIndex = ((page - 1) * limit);
        PageBean<Register> registerPageBean = new PageBean<Register>();
        registerPageBean.setData(doctorService.getRegisterByState(state, startIndex, limit));
        registerPageBean.setCount(doctorService.getRegisterByStateCount(state));
        System.out.println(registerPageBean);
        return registerPageBean;
    }

    @RequestMapping("/category.action")
    public String toCategory(){
        return "doctor/category";
    }
}
