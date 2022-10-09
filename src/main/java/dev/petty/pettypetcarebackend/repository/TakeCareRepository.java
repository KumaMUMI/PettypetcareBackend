package dev.petty.pettypetcarebackend.repository;

import dev.petty.pettypetcarebackend.entity.TakeCareEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TakeCareRepository extends JpaRepository<TakeCareEntity, Long> {
}
