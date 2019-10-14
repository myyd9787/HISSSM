package com.neuedu.service;

import com.neuedu.pojo.Register;

import java.util.List;

public interface DoctorService {
    //根据诊断状态查询患者
    List<Register> getRegisterByState(int state, int currentPage, int pageSize);

}
