package dev.petty.pettypetcarebackend.repository;

import dev.petty.pettypetcarebackend.entity.PetOwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetOwnerRepository extends JpaRepository<PetOwnerEntity, Long> {
}
