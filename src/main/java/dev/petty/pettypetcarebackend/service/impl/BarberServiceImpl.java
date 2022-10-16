package dev.petty.pettypetcarebackend.service.impl;

import dev.petty.pettypetcarebackend.entity.BarberEntity;
import dev.petty.pettypetcarebackend.repository.BarberRepository;
import dev.petty.pettypetcarebackend.service.BarberService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BarberServiceImpl implements BarberService {

    private final BarberRepository barberRepository;

    public BarberServiceImpl(BarberRepository barberRepository) {
        this.barberRepository = barberRepository;
    }

    @Override
    public List<BarberEntity> findAllBarber() {
        return this.barberRepository.findAll();
    }

    @Override
    public Optional<BarberEntity> findOneBarberById(Long id) {
        return this.barberRepository.findById(id);
    }

    @Override
    public BarberEntity saveBarber(BarberEntity barber) {
        return this.barberRepository.save(barber);
    }

    @Override
    public BarberEntity updateBarber(BarberEntity barber) {
        return this.barberRepository.save(barber);
    }

    @Override
    public void deleteBarberById(Long id) {
        this.barberRepository.deleteById(id);
    }
}
