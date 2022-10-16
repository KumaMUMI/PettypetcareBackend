package dev.petty.pettypetcarebackend.service.impl;

import dev.petty.pettypetcarebackend.entity.VeterinaryEntity;
import dev.petty.pettypetcarebackend.repository.VeterinaryRepository;
import dev.petty.pettypetcarebackend.service.VeterinaryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinaryServiceImpl implements VeterinaryService {

    private final VeterinaryRepository veterinaryRepository;

    public VeterinaryServiceImpl(VeterinaryRepository veterinaryRepository) {
        this.veterinaryRepository = veterinaryRepository;
    }

    @Override
    public List<VeterinaryEntity> findAllVeterinary() {
        return this.veterinaryRepository.findAll();
    }

    @Override
    public Optional<VeterinaryEntity> findOneVeterinaryById(Long id) {
        return this.veterinaryRepository.findById(id);
    }

    @Override
    public VeterinaryEntity saveVeterinary(VeterinaryEntity veterinary) {
        return this.veterinaryRepository.save(veterinary);
    }

    @Override
    public VeterinaryEntity updateVeterinary(VeterinaryEntity veterinary) {
        return this.veterinaryRepository.save(veterinary);
    }

    @Override
    public void daleteVeterinaryById(Long id) {
        this.veterinaryRepository.deleteById(id);
    }
}
