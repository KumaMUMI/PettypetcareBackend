package dev.petty.pettypetcarebackend.service.impl;

import dev.petty.pettypetcarebackend.entity.AppointEntity;
import dev.petty.pettypetcarebackend.repository.AppointRepository;
import dev.petty.pettypetcarebackend.service.AppointService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointServiceImpl implements AppointService {

    private final AppointRepository appointRepository;

    public AppointServiceImpl(AppointRepository appointRepository) {
        this.appointRepository = appointRepository;
    }

    @Override
    public List<AppointEntity> findAllAppoint() {
        return this.appointRepository.findAll();
    }

    @Override
    public Optional<AppointEntity> findOneAppointById(Long id) {
        return this.appointRepository.findById(id);
    }

    @Override
    public AppointEntity saveAppoint(AppointEntity appoint) {
        return this.appointRepository.save(appoint);
    }

    @Override
    public AppointEntity updateAppoint(AppointEntity appoint) {
        return this.appointRepository.save(appoint);
    }

    @Override
    public void daleteAppointById(Long id) {
        this.appointRepository.deleteById(id);
    }
}
