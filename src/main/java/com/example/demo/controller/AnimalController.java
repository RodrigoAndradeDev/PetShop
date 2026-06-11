package com.example.demo.controller;


import com.example.demo.repository.AnimalRepository;
import com.example.demo.repository.TutorRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private final AnimalRepository animalRepository;
    private final TutorRepository tutorRepository;


    public AnimalController(AnimalRepository animalRepository, TutorRepository tutorRepository) {
        this.animalRepository = animalRepository;
        this.tutorRepository = tutorRepository;
    }
}
