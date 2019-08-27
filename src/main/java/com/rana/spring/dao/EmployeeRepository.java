package com.rana.spring.dao;

import com.rana.spring.models.Employee;

import javax.transaction.Transactional;

@Transactional
public interface EmployeeRepository extends PersonGenericRepository<Employee> {
}
