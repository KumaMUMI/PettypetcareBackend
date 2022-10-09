package dev.petty.pettypetcarebackend.repository;

import dev.petty.pettypetcarebackend.entity.GroomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroomRepository extends JpaRepository<GroomEntity, Long> {
}
