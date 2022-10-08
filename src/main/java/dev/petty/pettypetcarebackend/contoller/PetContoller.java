package dev.petty.pettypetcarebackend.contoller;

import dev.petty.pettypetcarebackend.model.PetModel;
import dev.petty.pettypetcarebackend.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetContoller {
    @Autowired
    private final PetService petService;

    public PetContoller(PetService petService) {
        this.petService = petService;
    }

    @GetMapping( "/getAll")
    public @ResponseBody ResponseEntity<List<PetModel>> getAll(){
        return new ResponseEntity<>(petService.findAllPet(), HttpStatus.OK);
    }
}
