package dev.petty.pettypetcarebackend.repository;

import dev.petty.pettypetcarebackend.entity.BarberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberRepository extends JpaRepository<BarberEntity, Long> {
}
