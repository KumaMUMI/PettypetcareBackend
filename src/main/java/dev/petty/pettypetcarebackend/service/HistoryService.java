package dev.petty.pettypetcarebackend.service;

import dev.petty.pettypetcarebackend.entity.HistoryEntity;
import dev.petty.pettypetcarebackend.entity.StaffEntity;

import java.util.List;
import java.util.Optional;

public interface HistoryService {

    List<HistoryEntity> findAllHistory();

    Optional<HistoryEntity> findOneHistoryById(Long id);

    HistoryEntity saveHistory(HistoryEntity history);

    HistoryEntity updateHistory(HistoryEntity history);

    void deleteHistoryById(Long id);
}
