package com.example.demo.service;

import com.example.demo.entity.MyEmployee;
import com.example.demo.repository.MyEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSrvice {
    @Autowired
    private MyEmployeeRepo employeRepository;

    public List<MyEmployee> findAll() {
        return employeRepository.findAll();
    }

    public MyEmployee save(MyEmployee employe) {
        return employeRepository.save(employe);
    }
}
