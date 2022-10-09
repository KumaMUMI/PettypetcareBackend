package dev.petty.pettypetcarebackend.service.impl;

import dev.petty.pettypetcarebackend.entity.PetEntity;
import dev.petty.pettypetcarebackend.repository.PetRepository;
import dev.petty.pettypetcarebackend.service.PetService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;

    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public List<PetEntity> findAllPets() {
        return this.petRepository.findAll();
    }

    @Override
    public Optional<PetEntity> findOnePetById(Long id) {
        return this.petRepository.findById(id);
    }

    @Override
    public PetEntity savePet(PetEntity pet) {
        return this.petRepository.save(pet);
    }

    @Override
    public PetEntity updatePet(PetEntity pet) {
        return this.petRepository.save(pet);
    }

    @Override
    public void daletePetById(Long id) {
        this.petRepository.deleteById(id);
    }
}
