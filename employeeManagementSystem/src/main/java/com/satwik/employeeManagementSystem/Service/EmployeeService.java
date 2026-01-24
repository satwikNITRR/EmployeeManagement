package com.satwik.employeeManagementSystem.Service;

import com.satwik.employeeManagementSystem.DTO.EmployeeResponseDTO;
import com.satwik.employeeManagementSystem.Employee;
import com.satwik.employeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // -------- ADD EMPLOYEE --------
    public Employee addEmployee(Employee employee) {

        if (employeeRepository.existsByEmail(employee.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        Employee newEmployee = new Employee();
        newEmployee.setName(employee.getName());
        newEmployee.setEmail(employee.getEmail());
        newEmployee.setPhoneNumber(employee.getPhoneNumber());
        newEmployee.setAddress(employee.getAddress());
        newEmployee.setDateOfBirth(employee.getDateOfBirth());
        newEmployee.setJoiningDate(employee.getJoiningDate());
        newEmployee.setDesignation(employee.getDesignation());
        newEmployee.setDepartment(employee.getDepartment());
        newEmployee.setEmploymentType(employee.getEmploymentType());
        newEmployee.setSalary(employee.getSalary());
        newEmployee.setStatus(employee.getStatus());

        return employeeRepository.save(newEmployee);
    }

    // -------- UPDATE EMPLOYEE --------
    public Employee updateEmployee(Integer id, Employee employee) {

        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));

        if (employee.getEmail() != null &&
                employeeRepository.existsByEmailAndIdNot(employee.getEmail(), id)) {
            throw new RuntimeException("Email already exists for another employee");
        }

        // update only allowed fields
        existingEmployee.setName(employee.getName());
        existingEmployee.setDesignation(employee.getDesignation());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setEmploymentType(employee.getEmploymentType());
        existingEmployee.setSalary(employee.getSalary());
        existingEmployee.setStatus(employee.getStatus());

        if (employee.getEmail() != null) {
            existingEmployee.setEmail(employee.getEmail());
        }

        return employeeRepository.save(existingEmployee);
    }

    // -------- GET ALL --------
    public List<EmployeeResponseDTO> getAllEmployees() {

        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeResponseDTO> response = new ArrayList<>();

            for (Employee employee : employees) {

                EmployeeResponseDTO dto = new EmployeeResponseDTO();
                dto.setId(employee.getId());
                dto.setName(employee.getName());
                dto.setEmail(employee.getEmail());
                dto.setPhoneNumber(employee.getPhoneNumber());
                dto.setDesignation(employee.getDesignation());
                dto.setDepartment(employee.getDepartment());
                dto.setEmploymentType(employee.getEmploymentType());
                dto.setStatus(employee.getStatus());
                dto.setJoiningDate(employee.getJoiningDate());

                response.add(dto);
            }

            return response;
    }

    // -------- DELETE --------
    public void deleteEmployee(Integer id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));

        employeeRepository.delete(employee);
    }
}
