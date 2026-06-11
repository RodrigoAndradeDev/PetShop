package com.example.demo.controller;


import com.example.demo.repository.TutorRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutores")
public class TutorController {


    private final TutorRepository tutorRepository;


    public TutorController(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }
}
