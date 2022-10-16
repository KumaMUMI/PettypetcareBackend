package dev.petty.pettypetcarebackend.controller;

import dev.petty.pettypetcarebackend.entity.BarberEntity;
import dev.petty.pettypetcarebackend.entity.StaffEntity;
import dev.petty.pettypetcarebackend.service.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/barber")
public class BarberController {

    @Autowired
    private final BarberService barberService;

    public BarberController(BarberService barberService) {
        this.barberService = barberService;
    }

    @GetMapping("/findAll")
    public @ResponseBody ResponseEntity<List<BarberEntity>> getAllBarber() {
        return new ResponseEntity<>(this.barberService.findAllBarber(), HttpStatus.OK);
    }

    @GetMapping("/findOne/{barber_id}")
    public @ResponseBody ResponseEntity<Optional<BarberEntity>> getOneBarber(@PathVariable Long barber_id) {
        return new ResponseEntity<>(this.barberService.findOneBarberById(barber_id), HttpStatus.OK);
    }

    @PostMapping("/post")
    public @ResponseBody ResponseEntity<BarberEntity> postBarber(@RequestBody BarberEntity barber) {
        return new ResponseEntity<>(this.barberService.saveBarber(barber), HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public @ResponseBody ResponseEntity<BarberEntity> putBarber(@RequestBody BarberEntity barber ) {
        return new ResponseEntity<>(this.barberService.updateBarber(barber), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody ResponseEntity<String> deleteBarber(@PathVariable Long id) {
        this.barberService.deleteBarberById(id);
        return new ResponseEntity<>(String.format("%d has delete.", id), HttpStatus.OK);
    }
}
