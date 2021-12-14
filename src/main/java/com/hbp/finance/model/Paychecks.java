package com.hbp.finance.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="paychecks")
public class Paychecks {
    @Id
    @GeneratedValue
    Integer id;
    String nume;
    Integer amount;
    Date date;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="id_employee", nullable=false)
    Employee employee;

    public Paychecks() {

    }

    public Paychecks(Integer id, String nume, Integer amount, Date date, Employee employee) {
        this.id = id;
        this.nume = nume;
        this.amount = amount;
        this.date = date;
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
