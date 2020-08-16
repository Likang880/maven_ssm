package com.shop.dao;

import com.shop.domain.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> selectListAll();
}
