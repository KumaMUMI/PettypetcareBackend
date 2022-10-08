package dev.petty.pettypetcarebackend.service;

import dev.petty.pettypetcarebackend.model.PetModel;
import dev.petty.pettypetcarebackend.model.PetOwnerModels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PetService {
    List<PetModel> findAllPet();
}
