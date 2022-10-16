package dev.petty.pettypetcarebackend.controller;

import dev.petty.pettypetcarebackend.entity.VeterinaryEntity;
import dev.petty.pettypetcarebackend.service.VeterinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veterinary")
public class VeterinaryController {

    @Autowired
    private final VeterinaryService veterinaryService;

    public VeterinaryController(VeterinaryService veterinaryService) {
        this.veterinaryService = veterinaryService;
    }

    @GetMapping("/findAll")
    public @ResponseBody ResponseEntity<List<VeterinaryEntity>> getAllPet() {
        return new ResponseEntity<>(this.veterinaryService.findAllVeterinary(), HttpStatus.OK);
    }

    @GetMapping("/findOne/{veterinary_id}")
    public @ResponseBody ResponseEntity<Optional<VeterinaryEntity>> getOnePet(@PathVariable Long veterinary_id) {
        return new ResponseEntity<>(this.veterinaryService.findOneVeterinaryById(veterinary_id), HttpStatus.OK);
    }

    @PostMapping("/post")
    public @ResponseBody ResponseEntity<VeterinaryEntity> postPet(@RequestBody VeterinaryEntity veterinary) {
        return new ResponseEntity<>(this.veterinaryService.saveVeterinary(veterinary), HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public @ResponseBody ResponseEntity<VeterinaryEntity> putPet(@RequestBody VeterinaryEntity veterinary ) {
        return new ResponseEntity<>(this.veterinaryService.updateVeterinary(veterinary), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody ResponseEntity<String> deletePet(@PathVariable Long id) {
        this.veterinaryService.daleteVeterinaryById(id);
        return new ResponseEntity<>(String.format("%d has delete.", id), HttpStatus.OK);
    }
}
