package dev.petty.pettypetcarebackend.service;


import dev.petty.pettypetcarebackend.entity.VeterinaryEntity;

import java.util.List;
import java.util.Optional;

public interface VeterinaryService {

    List<VeterinaryEntity> findAllVeterinary();

    Optional<VeterinaryEntity> findOneVeterinaryById(Long id);

    VeterinaryEntity saveVeterinary(VeterinaryEntity veterinary);

    VeterinaryEntity updateVeterinary(VeterinaryEntity veterinary);

    void daleteVeterinaryById(Long id);
}
