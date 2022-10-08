package dev.petty.pettypetcarebackend.repository;

import dev.petty.pettypetcarebackend.model.PetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<PetModel,Long> {
}
