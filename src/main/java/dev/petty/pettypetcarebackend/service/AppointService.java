package dev.petty.pettypetcarebackend.service;

import dev.petty.pettypetcarebackend.entity.AppointEntity;
import dev.petty.pettypetcarebackend.entity.StaffEntity;

import java.util.List;
import java.util.Optional;

public interface AppointService {
    List<AppointEntity> findAllAppoint();

    Optional<AppointEntity> findOneAppointById(Long id);

    AppointEntity saveAppoint(AppointEntity appoint);

    AppointEntity updateAppoint(AppointEntity appoint);

    void daleteAppointById(Long id);
}
