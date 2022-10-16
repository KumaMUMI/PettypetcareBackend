package dev.petty.pettypetcarebackend.controller;

import dev.petty.pettypetcarebackend.entity.AppointEntity;
import dev.petty.pettypetcarebackend.entity.StaffEntity;
import dev.petty.pettypetcarebackend.service.AppointService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/appoint")
public class AppointController {

    private final AppointService appointService;

    public AppointController(AppointService appointService) {
        this.appointService = appointService;
    }

    @GetMapping("/findAll")
    public @ResponseBody ResponseEntity<List<AppointEntity>> getAllPet() {
        return new ResponseEntity<>(this.appointService.findAllAppoint(), HttpStatus.OK);
    }

    @GetMapping("/findOne/{appoint_id}")
    public @ResponseBody ResponseEntity<Optional<AppointEntity>> getOnePet(@PathVariable Long appoint_id) {
        return new ResponseEntity<>(this.appointService.findOneAppointById(appoint_id), HttpStatus.OK);
    }

    @PostMapping("/post")
    public @ResponseBody ResponseEntity<AppointEntity> postPet(@RequestBody AppointEntity appoint) {
        return new ResponseEntity<>(this.appointService.saveAppoint(appoint), HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public @ResponseBody ResponseEntity<AppointEntity> putPet(@RequestBody AppointEntity appoint ) {
        return new ResponseEntity<>(this.appointService.updateAppoint(appoint), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody ResponseEntity<String> deletePet(@PathVariable Long id) {
        this.appointService.daleteAppointById(id);
        return new ResponseEntity<>(String.format("%d has delete.", id), HttpStatus.OK);
    }
}
