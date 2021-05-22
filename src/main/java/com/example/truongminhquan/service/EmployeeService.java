package com.example.truongminhquan.service;

import com.example.truongminhquan.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity createEmployee(EmployeeEntity e);
    List<EmployeeEntity> findAllEmployees();
}
