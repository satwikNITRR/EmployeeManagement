package com.satwik.employeeManagementSystem.repository;

import com.satwik.employeeManagementSystem.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, Integer id);
}


