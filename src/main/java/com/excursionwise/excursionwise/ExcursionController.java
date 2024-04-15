package com.excursionwise.excursionwise;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExcursionController {
    private final ExcursionRepository excursionRepository;

    public ExcursionController(ExcursionRepository excursionRepository){
        this.excursionRepository = excursionRepository;
    }

    @GetMapping("/excursions")
    public List<Excursion> all(){
        return excursionRepository.findAll();
    }

    @PostMapping("/excursions")
    Excursion newEmployee(@RequestBody Excursion newExcursion) {
        return excursionRepository.save(newExcursion);
    }


}
