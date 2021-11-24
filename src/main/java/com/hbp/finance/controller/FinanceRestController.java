package com.hbp.finance.controller;

import com.hbp.finance.model.Employee;
import com.hbp.finance.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FinanceRestController {

    @Autowired
    EmployeeRepository employeeRepository;


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/salam")
    List<String> all() {
        List<String> salam= new ArrayList<>();
        salam.add("parizer");
        salam.add("paine");
        salam.add("ceapa");
        return salam;
    }
    @GetMapping("/employee")
    List<Employee> employees(){
        return employeeRepository.findAll();
    }



    // end::get-aggregate-root[]
/*
    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }
*/

}
