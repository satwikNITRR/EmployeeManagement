package com.satwik.employeeManagementSystem.service;

import com.satwik.employeeManagementSystem.dto.EmployeeCreateRequestDTO;
import com.satwik.employeeManagementSystem.dto.EmployeeResponseDTO;
import com.satwik.employeeManagementSystem.dto.EmployeeUpdateRequestDTO;
import com.satwik.employeeManagementSystem.entity.Employee;
import com.satwik.employeeManagementSystem.exception.ConflictException;
import com.satwik.employeeManagementSystem.exception.ResourceNotFoundException;
import com.satwik.employeeManagementSystem.mapper.EmployeeMapper;
import com.satwik.employeeManagementSystem.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    public EmployeeResponseDTO createEmployee(EmployeeCreateRequestDTO requestDTO) {
        if (employeeRepository.existsByEmail(requestDTO.getEmail())) {
            throw new ConflictException("Employee with email " + requestDTO.getEmail() + " already exists");
        }


        Employee employee = employeeMapper.toEntity(requestDTO);
        Employee savedEmployee = employeeRepository.save(employee);
        return employeeMapper.toResponseDTO(savedEmployee);
    }

    public List<EmployeeResponseDTO> getAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(employeeMapper::toResponseDTO)
                .toList();
    }

    public EmployeeResponseDTO getEmployeeById(Integer id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id " + id));

        return employeeMapper.toResponseDTO(employee);
    }

    public EmployeeResponseDTO updateEmployee(Integer id, EmployeeUpdateRequestDTO requestDTO) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id " + id));

        if (employeeRepository.existsByEmailAndIdNot(requestDTO.getEmail(), id)) {
            throw new ConflictException("Employee with email " + requestDTO.getEmail() + " already exists");
        }

        employeeMapper.updateEntity(employee, requestDTO);
        Employee updatedEmployee = employeeRepository.save(employee);
        return employeeMapper.toResponseDTO(updatedEmployee);
    }

    public void deleteEmployee(Integer id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id " + id));

        employeeRepository.delete(employee);
    }
}
