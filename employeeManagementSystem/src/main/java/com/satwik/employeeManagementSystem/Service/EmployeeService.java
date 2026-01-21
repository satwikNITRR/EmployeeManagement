package com.satwik.employeeManagementSystem.Service;

import com.satwik.employeeManagementSystem.DTO.EmployeeResponseDTO;
import com.satwik.employeeManagementSystem.Employee;
import com.satwik.employeeManagementSystem.DTO.EmployeeResponseDTO;
import com.satwik.employeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeerepository;

    public List<EmployeeResponseDTO> getAllEmployee() {
        List<Employee> allEmployees=employeerepository.findAll();

        ArrayList<EmployeeResponseDTO> allemployeeDTO=new ArrayList<EmployeeResponseDTO>();
        for(Employee employee : allEmployees){
            EmployeeResponseDTO dto=new EmployeeResponseDTO();
            dto.setId(employee.getId());
            dto.setName(employee.getName());
            dto.setEmail(employee.getEmail());
            dto.setPhoneNumber(employee.getPhoneNumber());
            dto.setDesignation(employee.getDesignation());
            dto.setDepartment(employee.getDepartment());
            dto.setEmploymentType(employee.getEmploymentType());
            dto.setStatus(employee.getStatus());
            dto.setJoiningDate(employee.getJoiningDate());
            allemployeeDTO.add(dto);
        }
        return allemployeeDTO;
    }
}
