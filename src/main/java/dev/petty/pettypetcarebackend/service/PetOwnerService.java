package dev.petty.pettypetcarebackend.service;

import dev.petty.pettypetcarebackend.model.PetOwnerModels;

import java.util.List;
import java.util.Optional;

public interface PetOwnerService {

    List<PetOwnerModels> findAllOwner();

    Optional<PetOwnerModels> findById(Long owner_id);

    PetOwnerModels saveOwner(PetOwnerModels owner);

    void deleteOwner(Long owner_id);
}
