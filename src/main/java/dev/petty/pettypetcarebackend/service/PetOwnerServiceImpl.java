package dev.petty.pettypetcarebackend.service;

import dev.petty.pettypetcarebackend.model.PetOwnerModels;
import dev.petty.pettypetcarebackend.repository.PetOwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetOwnerServiceImpl implements PetOwnerService{
    private final PetOwnerRepository ownerRepository;


    public PetOwnerServiceImpl(PetOwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public List<PetOwnerModels> findAllOwner() {
        return this.ownerRepository.findAll();
    }

    @Override
    public Optional<PetOwnerModels> findById(Long owner_id) {
        return this.ownerRepository.findById(owner_id);
    }

    @Override
    public PetOwnerModels saveOwner(PetOwnerModels owner) {
        return this.ownerRepository.save(owner);
    }

    @Override
    public void deleteOwner(Long owner_id) {
        this.ownerRepository.deleteById(owner_id);
    }
}
