package com.neuedu.service.impl;

import com.neuedu.mapper.RegisterMapper;
import com.neuedu.pojo.Register;
import com.neuedu.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private RegisterMapper registerMapper;

    public List<Register> getRegisterByState(int state, int currentPage, int pageSize) {
        return registerMapper.getRegisterByState(state);
    }
}
