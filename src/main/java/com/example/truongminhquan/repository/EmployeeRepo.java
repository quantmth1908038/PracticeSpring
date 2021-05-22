package com.example.truongminhquan.repository;

import com.example.truongminhquan.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {

}
