package com.satwik.employeeManagementSystem;

import com.satwik.employeeManagementSystem.Valid.Add;
import com.satwik.employeeManagementSystem.Valid.Update;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @NotNull(groups = {Add.class, Update.class})
    private String name;

    @NotNull(groups = Add.class)
    @Email
    @Column(unique = true)
    private String email;

    @NotNull(groups = Add.class)
    private String phoneNumber;

    @NotNull(groups = Add.class)
    private String address;

    @NotNull(groups = Add.class)
    private LocalDate dateOfBirth;

    @NotNull(groups = Add.class)
    private LocalDate joiningDate;

    @NotNull(groups = {Add.class, Update.class})
    private String designation;

    @NotNull(groups = {Add.class, Update.class})
    private String department;

    @NotNull(groups = {Add.class, Update.class})
    private String employmentType;

    @NotNull(groups = {Add.class, Update.class})
    private Double salary;

    @NotNull(groups = {Add.class, Update.class})
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
