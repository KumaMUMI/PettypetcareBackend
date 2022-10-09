package dev.petty.pettypetcarebackend.repository;

import dev.petty.pettypetcarebackend.entity.AppointEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointRepository extends JpaRepository<AppointEntity, Long> {
}
