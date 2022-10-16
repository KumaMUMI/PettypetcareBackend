package dev.petty.pettypetcarebackend.service.impl;

import dev.petty.pettypetcarebackend.entity.StaffEntity;
import dev.petty.pettypetcarebackend.repository.StaffRepository;
import dev.petty.pettypetcarebackend.service.StaffService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffServiceImpl implements StaffService {

    private final StaffRepository staffRepository;

    public StaffServiceImpl(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    public List<StaffEntity> findAllStaff() {
        return this.staffRepository.findAll();
    }

    @Override
    public Optional<StaffEntity> findOneStaffById(Long id) {
        return this.staffRepository.findById(id);
    }

    @Override
    public StaffEntity saveStaff(StaffEntity staff) {
        return this.staffRepository.save(staff);
    }

    @Override
    public StaffEntity updateStaff(StaffEntity staff) {
        return this.staffRepository.save(staff);
    }

    @Override
    public void deleteStaffById(Long id) {
        this.staffRepository.deleteById(id);
    }
}
