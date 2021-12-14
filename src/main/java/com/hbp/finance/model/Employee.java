package com.hbp.finance.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="table_employees")
@JsonAutoDetect
public class Employee {
    @Id @GeneratedValue
    Integer id;
    String name;
    String role;
    @Column(name ="employee_paycheck")
    Integer employeePaycheck;
    @JsonManagedReference
    @OneToMany(mappedBy = "employee")
    List<Paychecks> paychecks;

    public Employee() {
    }

    public Employee(String name, String role, Integer employeePaycheck) {
        this.name = name;
        this.role = role;
        this.employeePaycheck = employeePaycheck;
    }

    public Employee(Integer id, String name, String role, Integer employeePaycheck, List<Paychecks> paychecks) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.employeePaycheck = employeePaycheck;
        this.paychecks = paychecks;
    }

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

    public List<Paychecks> getPaychecks() {
        return paychecks;
    }

    public void setPaychecks(List<Paychecks> paychecks) {
        this.paychecks = paychecks;
    }
}
