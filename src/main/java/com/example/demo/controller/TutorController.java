package com.example.demo.controller;


import com.example.demo.model.Tutor;
import com.example.demo.repository.TutorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutores")
public class TutorController {
    private final TutorRepository tutorRepository;

    public TutorController(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tutor criar(@RequestBody Tutor tutor) {
        System.out.println("Criando tutor com sucesso!");
        tutor.setId(tutor.getId());
        return tutorRepository.save(tutor);
    }

    @GetMapping
    public List<Tutor> ListarTutores(){
        System.out.println("Listando tutores com sucesso!");
        return tutorRepository.findAll();
    }

}