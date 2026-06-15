package com.example.demo.dto;

import com.example.demo.model.Animal;

public record AnimalResponseDTO(Long id, String nome, String especie, String nomeTutor) {

    public static AnimalResponseDTO converter(Animal animal){
        return new AnimalResponseDTO(
                animal.getId(),
                animal.getNome(),
                animal.getEspecie(),
                animal.getTutor().getNome()
        );
    }

}
