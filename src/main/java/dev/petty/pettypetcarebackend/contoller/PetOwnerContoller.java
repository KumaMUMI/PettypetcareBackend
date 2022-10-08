package dev.petty.pettypetcarebackend.contoller;

import dev.petty.pettypetcarebackend.model.PetOwnerModels;
import dev.petty.pettypetcarebackend.service.PetOwnerService;
import dev.petty.pettypetcarebackend.service.PetOwnerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet_owner")
public class PetOwnerContoller {
    @Autowired
    private final PetOwnerService ownerService;

    public PetOwnerContoller(PetOwnerService ownerService) {
        this.ownerService = ownerService;
    }

//    @PostMapping ("/save")
//    public @ResponseBody ResponseEntity<PetOwnerModels> saveOwner(){
//        return new ResponseEntity<PetOwnerModels>("Save_Owner",HttpStatus.OK);
//    }

    @GetMapping("/getAll")
    public @ResponseBody ResponseEntity<List<PetOwnerModels>> findAllOwners(){
        return new ResponseEntity<>(ownerService.findAllOwner(),HttpStatus.OK);
    }


}
