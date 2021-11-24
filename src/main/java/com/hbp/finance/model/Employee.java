package com.hbp.finance.model;

import javax.persistence.*;

@Entity
@Table(name="table_employees")
public class Employee {
    @Id @GeneratedValue
    Integer id;
    String name;
    String role;
    @Column(name ="employee_paycheck")
    Integer employeePaycheck;

    public Employee() {
    }

    public Employee(String name, String role, Integer employeePaycheck) {
        this.name = name;
        this.role = role;
        this.employeePaycheck = employeePaycheck;
    }

    public int getId() {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getEmployeePaycheck() {
        return employeePaycheck;
    }

    public void setEmployeePaycheck(Integer employeePaycheck) {
        this.employeePaycheck = employeePaycheck;
    }
}
