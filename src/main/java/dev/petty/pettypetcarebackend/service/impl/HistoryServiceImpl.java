package dev.petty.pettypetcarebackend.service.impl;

import dev.petty.pettypetcarebackend.entity.HistoryEntity;
import dev.petty.pettypetcarebackend.repository.HistoryRepository;
import dev.petty.pettypetcarebackend.service.HistoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoryServiceImpl implements HistoryService {

    private final HistoryRepository historyRepository;

    public HistoryServiceImpl(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    @Override
    public List<HistoryEntity> findAllHistory() {
        return this.historyRepository.findAll();
    }

    @Override
    public Optional<HistoryEntity> findOneHistoryById(Long id) {
        return this.historyRepository.findById(id);
    }

    @Override
    public HistoryEntity saveHistory(HistoryEntity history) {
        return this.historyRepository.save(history);
    }

    @Override
    public HistoryEntity updateHistory(HistoryEntity history) {
        return this.historyRepository.save(history);
    }

    @Override
    public void deleteHistoryById(Long id) {
        this.historyRepository.deleteById(id);
    }
}
