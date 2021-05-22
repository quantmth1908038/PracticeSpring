package com.example.truongminhquan.service;

import com.example.truongminhquan.entity.EmployeeEntity;
import com.example.truongminhquan.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;


    @Override
    public EmployeeEntity createEmployee(EmployeeEntity e) {
        return employeeRepo.save(e);
    }

    @Override
    public List<EmployeeEntity> findAllEmployees() {
        return employeeRepo.findAll();
    }
}
