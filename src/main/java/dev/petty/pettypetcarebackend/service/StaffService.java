package dev.petty.pettypetcarebackend.service;

import dev.petty.pettypetcarebackend.entity.PetEntity;
import dev.petty.pettypetcarebackend.entity.StaffEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface StaffService {

    List<StaffEntity> findAllStaff();

    Optional<StaffEntity> findOneStaffById(Long id);

    StaffEntity saveStaff(StaffEntity staff);

    StaffEntity updateStaff(StaffEntity staff);

    void deleteStaffById(Long id);
}
