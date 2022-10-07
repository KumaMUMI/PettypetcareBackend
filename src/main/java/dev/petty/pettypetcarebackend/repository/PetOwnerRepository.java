package dev.petty.pettypetcarebackend.repository;

import dev.petty.pettypetcarebackend.model.PetOwnerModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetOwnerRepository extends JpaRepository<PetOwnerModels,Long> {

}
