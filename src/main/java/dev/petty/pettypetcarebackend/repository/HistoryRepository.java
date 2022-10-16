package dev.petty.pettypetcarebackend.repository;

import dev.petty.pettypetcarebackend.entity.HistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<HistoryEntity,Long> {
}
