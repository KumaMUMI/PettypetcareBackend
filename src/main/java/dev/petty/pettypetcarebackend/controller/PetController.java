package dev.petty.pettypetcarebackend.controller;

import dev.petty.pettypetcarebackend.entity.PetEntity;
import dev.petty.pettypetcarebackend.entity.PetOwnerEntity;
import dev.petty.pettypetcarebackend.service.PetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pet")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/findAll")
    public @ResponseBody ResponseEntity<List<PetEntity>> getAllOwner() {
        return new ResponseEntity<>(this.petService.findAllPets(), HttpStatus.OK);
    }

    @GetMapping("/findOne/{pet_id}")
    public @ResponseBody ResponseEntity<Optional<PetEntity>> getOneOwner(@PathVariable Long pet_id) {
        return new ResponseEntity<>(this.petService.findOnePetById(pet_id), HttpStatus.OK);
    }

    @PostMapping("/post")
    public @ResponseBody ResponseEntity<PetEntity> postOwner(@RequestBody PetEntity pet) {
        return new ResponseEntity<>(this.petService.savePet(pet), HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public @ResponseBody ResponseEntity<PetEntity> putOwner(@RequestBody PetEntity pet ) {
        return new ResponseEntity<>(this.petService.savePet(pet), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody ResponseEntity<String> deleteOwner(@PathVariable Long id) {
        this.petService.daletePetById(id);
        return new ResponseEntity<>(String.format("%d has delete.", id), HttpStatus.OK);
    }
}
