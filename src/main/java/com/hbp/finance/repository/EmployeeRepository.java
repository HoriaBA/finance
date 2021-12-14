package com.hbp.finance.repository;

import com.hbp.finance.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
