package dev.petty.pettypetcarebackend.service.impl;

import dev.petty.pettypetcarebackend.entity.PetOwnerEntity;
import dev.petty.pettypetcarebackend.repository.PetOwnerRepository;
import dev.petty.pettypetcarebackend.service.PetOwnerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetOwnerServiceImpl implements PetOwnerService {

    private final PetOwnerRepository petOwnerRepository;

    public PetOwnerServiceImpl(PetOwnerRepository petOwnerRepository) {
        this.petOwnerRepository = petOwnerRepository;
    }

    @Override
    public List<PetOwnerEntity> findAllOwners() {
        return this.petOwnerRepository.findAll();
    }

    @Override
    public Optional<PetOwnerEntity> findOneOwnerById(Long id) {
        return this.petOwnerRepository.findById(id);
    }

    @Override
    public PetOwnerEntity saveOwner(PetOwnerEntity owner) {
        return this.petOwnerRepository.save(owner);
    }

    @Override
    public PetOwnerEntity updateOwner(PetOwnerEntity owner) {
        return this.petOwnerRepository.save(owner);
    }

    @Override
    public void daleteOwnerById(Long id) {
        this.petOwnerRepository.deleteById(id);
    }
}
