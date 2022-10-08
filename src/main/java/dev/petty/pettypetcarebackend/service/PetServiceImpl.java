package dev.petty.pettypetcarebackend.service;

import dev.petty.pettypetcarebackend.model.PetModel;
import dev.petty.pettypetcarebackend.repository.PetRepository;
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
    public List<PetModel> findAllPet(){
        return this.petRepository.findAll();
    }
}
