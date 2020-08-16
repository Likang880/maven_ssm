package com.shop.service.impl;

import com.shop.dao.EmployeeMapper;
import com.shop.domain.Employee;
import com.shop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> slectEmployeeList() {
        List<Employee> employees = this.employeeMapper.selectListAll();
        return employees;
    }
}
