package com.satwik.employeeManagementSystem.Controller;

import com.satwik.employeeManagementSystem.Employee;
import com.satwik.employeeManagementSystem.Service.EmployeeService;
import com.satwik.employeeManagementSystem.validation.Add;
import com.satwik.employeeManagementSystem.validation.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // -------- ADD EMPLOYEE --------
    @PostMapping
    public Employee addEmployee(
            @Validated(Add.class) @RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    // -------- UPDATE EMPLOYEE --------
    @PutMapping("/{id}")
    public Employee updateEmployee(
            @PathVariable Integer id,
            @Validated(Update.class) @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    // -------- GET ALL EMPLOYEES --------
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // -------- DELETE EMPLOYEE --------
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteEmployee(id);
        return "Employee deleted successfully";
    }
}
