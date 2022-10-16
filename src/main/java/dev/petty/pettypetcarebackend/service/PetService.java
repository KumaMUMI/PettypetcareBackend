package dev.petty.pettypetcarebackend.service;

import dev.petty.pettypetcarebackend.entity.PetEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PetService {

    List<PetEntity> findAllPets();

    Optional<PetEntity> findOnePetById(Long id);

    PetEntity savePet(PetEntity pet);

    PetEntity updatePet(PetEntity pet);

    void daletePetById(Long id);
}
