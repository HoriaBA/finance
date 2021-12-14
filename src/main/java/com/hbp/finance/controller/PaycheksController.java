package com.hbp.finance.controller;

import com.hbp.finance.exception.PaychecksNotFoundException;
import com.hbp.finance.model.Paychecks;
import com.hbp.finance.repository.PaycheksRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaycheksController {

    PaycheksRepository paycheksRepository;

    public PaycheksController(PaycheksRepository paycheksRepository) {
        this.paycheksRepository = paycheksRepository;
    }

    @GetMapping("/paychecks")
    List<Paychecks> paychecks(){
        return paycheksRepository.findAll();
    }

    @GetMapping("/paychecks/{id}")
    Paychecks one(@PathVariable Integer id) {

        return paycheksRepository.findById(id)
                .orElseThrow(() -> new PaychecksNotFoundException(id));
    }

    @PostMapping("/paychecks")
    Paychecks postPaychecks(@RequestBody Paychecks newPaychecks){
        paycheksRepository.save(newPaychecks);
        return newPaychecks;
    }
}
