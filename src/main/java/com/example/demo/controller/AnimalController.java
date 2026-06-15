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
<<<<<<< Updated upstream
=======


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AnimalResponseDTO criar(@Valid @RequestBody AnimalRequestDTO request) {
        System.out.println("Iniciando o registro do animal...");

        Tutor existeTutor = tutorRepository.findById(request.tutorId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tutor não encontrado"));

        Animal saveAnimal = new Animal();
        saveAnimal.setNome(request.nome());
        saveAnimal.setEspecie(request.especie());
        saveAnimal.setIdade(request.idade());
        saveAnimal.setTutor(existeTutor);

        Animal animalSalvo = animalRepository.save(saveAnimal);

        System.out.println("Animal salvo com sucesso!");

        return AnimalResponseDTO.converter(animalSalvo);
    }

    @GetMapping
    public List<AnimalResponseDTO> listarAnimais(){
        System.out.println("Listamento feito com sucesso!");
        return animalRepository.findAll().stream().map(AnimalResponseDTO::converter).toList();
    }


>>>>>>> Stashed changes
}
