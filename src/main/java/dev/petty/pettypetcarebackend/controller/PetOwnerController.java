package dev.petty.pettypetcarebackend.controller;

import dev.petty.pettypetcarebackend.entity.PetOwnerEntity;
import dev.petty.pettypetcarebackend.service.PetOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/petOwner")
public class PetOwnerController {
    @Autowired
    private final PetOwnerService petOwnerService;

    public PetOwnerController(PetOwnerService petOwnerService) {
        this.petOwnerService = petOwnerService;
    }

    @GetMapping("/findAll")
    public @ResponseBody ResponseEntity<List<PetOwnerEntity>> getAllOwner() {
        return new ResponseEntity<>(this.petOwnerService.findAllOwners(), HttpStatus.OK);
    }

    @GetMapping("/findOne/{owner_id}")
    public @ResponseBody ResponseEntity<Optional<PetOwnerEntity>> getOneOwner(@PathVariable Long owner_id) {
        return new ResponseEntity<>(this.petOwnerService.findOneOwnerById(owner_id), HttpStatus.OK);
    }

    @PostMapping("/post")
    public @ResponseBody ResponseEntity<PetOwnerEntity> postOwner(@RequestBody PetOwnerEntity petOwner) {
        return new ResponseEntity<>(this.petOwnerService.saveOwner(petOwner), HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public @ResponseBody ResponseEntity<PetOwnerEntity> putOwner(@RequestBody PetOwnerEntity petOwner) {
        return new ResponseEntity<>(this.petOwnerService.saveOwner(petOwner), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody ResponseEntity<String> deleteOwner(@PathVariable Long id) {
        this.petOwnerService.daleteOwnerById(id);
        return new ResponseEntity<>(String.format("%d has delete.", id), HttpStatus.OK);
    }


}
