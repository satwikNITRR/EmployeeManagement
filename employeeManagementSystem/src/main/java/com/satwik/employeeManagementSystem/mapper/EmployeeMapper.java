package com.satwik.employeeManagementSystem.mapper;

import com.satwik.employeeManagementSystem.dto.EmployeeCreateRequestDTO;
import com.satwik.employeeManagementSystem.dto.EmployeeResponseDTO;
import com.satwik.employeeManagementSystem.dto.EmployeeUpdateRequestDTO;
import com.satwik.employeeManagementSystem.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public Employee toEntity(EmployeeCreateRequestDTO requestDTO) {
        Employee employee = new Employee();
        employee.setName(requestDTO.getName());
        employee.setEmail(requestDTO.getEmail());
        employee.setPhoneNumber(requestDTO.getPhoneNumber());
        employee.setAddress(requestDTO.getAddress());
        employee.setDateOfBirth(requestDTO.getDateOfBirth());
        employee.setJoiningDate(requestDTO.getJoiningDate());
        employee.setDesignation(requestDTO.getDesignation());
        employee.setDepartment(requestDTO.getDepartment());
        employee.setEmploymentType(requestDTO.getEmploymentType());
        employee.setStatus(requestDTO.getStatus());
        return employee;
    }

    public void updateEntity(Employee employee, EmployeeUpdateRequestDTO requestDTO) {
        employee.setName(requestDTO.getName());
        employee.setEmail(requestDTO.getEmail());
        employee.setPhoneNumber(requestDTO.getPhoneNumber());
        employee.setAddress(requestDTO.getAddress());
        employee.setDateOfBirth(requestDTO.getDateOfBirth());
        employee.setJoiningDate(requestDTO.getJoiningDate());
        employee.setDesignation(requestDTO.getDesignation());
        employee.setDepartment(requestDTO.getDepartment());
        employee.setEmploymentType(requestDTO.getEmploymentType());
        employee.setStatus(requestDTO.getStatus());
    }

    public EmployeeResponseDTO toResponseDTO(Employee employee) {
        EmployeeResponseDTO responseDTO = new EmployeeResponseDTO();
        responseDTO.setId(employee.getId());
        responseDTO.setName(employee.getName());
        responseDTO.setEmail(employee.getEmail());
        responseDTO.setPhoneNumber(employee.getPhoneNumber());
        responseDTO.setAddress(employee.getAddress());
        responseDTO.setDateOfBirth(employee.getDateOfBirth());
        responseDTO.setJoiningDate(employee.getJoiningDate());
        responseDTO.setDesignation(employee.getDesignation());
        responseDTO.setDepartment(employee.getDepartment());
        responseDTO.setEmploymentType(employee.getEmploymentType());
        responseDTO.setStatus(employee.getStatus());
        return responseDTO;
    }
}
