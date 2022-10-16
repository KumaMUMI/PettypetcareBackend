package dev.petty.pettypetcarebackend.service;

import dev.petty.pettypetcarebackend.entity.BarberEntity;
import dev.petty.pettypetcarebackend.entity.StaffEntity;

import java.util.List;
import java.util.Optional;

public interface BarberService {

    List<BarberEntity> findAllBarber();

    Optional<BarberEntity> findOneBarberById(Long id);

    BarberEntity saveBarber(BarberEntity barber);

    BarberEntity updateBarber(BarberEntity barber);

    void deleteBarberById(Long id);
}
