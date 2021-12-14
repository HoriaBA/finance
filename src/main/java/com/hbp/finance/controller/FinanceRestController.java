package com.hbp.finance.controller;

import com.hbp.finance.exception.EmployeeNotFoundException;
import com.hbp.finance.model.Employee;
import com.hbp.finance.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FinanceRestController {

    @Autowired
    EmployeeRepository employeeRepository;


    // Aggregate root
    // tag::get-aggregate-root[]

    @GetMapping("/employee")
    List<Employee> employees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/employee/{id}")
    Employee one(@PathVariable Integer id) {

        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PostMapping("/employee")
    Employee postEmployees(@RequestBody Employee newEmployee){
        employeeRepository.save(newEmployee);
        return newEmployee;
    }



    // end::get-aggregate-root[]
/*
    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }
*/

}
