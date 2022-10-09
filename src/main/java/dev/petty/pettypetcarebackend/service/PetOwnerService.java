package dev.petty.pettypetcarebackend.service;

import dev.petty.pettypetcarebackend.entity.PetOwnerEntity;

import java.util.List;
import java.util.Optional;

public interface PetOwnerService {

    List<PetOwnerEntity> findAllOwners();

    Optional<PetOwnerEntity> findOneOwnerById(Long id);

    PetOwnerEntity saveOwner(PetOwnerEntity owner);

    PetOwnerEntity updateOwner(PetOwnerEntity owner);

    void daleteOwnerById(Long id);
}
