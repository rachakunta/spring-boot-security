package com.rana.spring.repository;

import com.rana.spring.models.Employee;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
public interface EmployeeRepository extends PersonGenericRepository<Employee> {
}
