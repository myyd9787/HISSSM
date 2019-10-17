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

    public List<Register> getRegisterByState(int state, int startIndex, int pageSize) {
        List<Register> registerList = registerMapper.getRegisterByState(state, startIndex, pageSize);
        for (Register r:registerList) {
            System.out.println(r.getID());
        }
        return registerList;
    }

    public int getRegisterByStateCount(int state) {
        return registerMapper.getRegisterByStateCount(state);
    }
}
