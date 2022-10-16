package dev.petty.pettypetcarebackend.controller;

import dev.petty.pettypetcarebackend.entity.PetEntity;
import dev.petty.pettypetcarebackend.entity.StaffEntity;
import dev.petty.pettypetcarebackend.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping("/findAll")
    public @ResponseBody ResponseEntity<List<StaffEntity>> getAllStaff() {
        return new ResponseEntity<>(this.staffService.findAllStaff(), HttpStatus.OK);
    }

    @GetMapping("/findOne/{staff_id}")
    public @ResponseBody ResponseEntity<Optional<StaffEntity>> getOneStaff(@PathVariable Long staff_id) {
        return new ResponseEntity<>(this.staffService.findOneStaffById(staff_id), HttpStatus.OK);
    }

    @PostMapping("/post")
    public @ResponseBody ResponseEntity<StaffEntity> postStaff(@RequestBody StaffEntity staff) {
        return new ResponseEntity<>(this.staffService.saveStaff(staff), HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public @ResponseBody ResponseEntity<StaffEntity> putStaff(@RequestBody StaffEntity staff ) {
        return new ResponseEntity<>(this.staffService.saveStaff(staff), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody ResponseEntity<String> deleteStaff(@PathVariable Long id) {
        this.staffService.deleteStaffById(id);
        return new ResponseEntity<>(String.format("%d has delete.", id), HttpStatus.OK);
    }
}
