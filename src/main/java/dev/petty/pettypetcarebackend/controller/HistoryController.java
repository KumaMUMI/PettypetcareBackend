package dev.petty.pettypetcarebackend.controller;

import dev.petty.pettypetcarebackend.entity.HistoryEntity;
import dev.petty.pettypetcarebackend.entity.StaffEntity;
import dev.petty.pettypetcarebackend.service.HistoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/history")
public class HistoryController {

    private final HistoryService historyService;

    public HistoryController(HistoryService historyService) {
        this.historyService = historyService;
    }

    @GetMapping("/findAll")
    public @ResponseBody ResponseEntity<List<HistoryEntity>> getAllHistory() {
        return new ResponseEntity<>(this.historyService.findAllHistory(), HttpStatus.OK);
    }

    @GetMapping("/findOne/{history_id}")
    public @ResponseBody ResponseEntity<Optional<HistoryEntity>> getOneHistory(@PathVariable Long history_id) {
        return new ResponseEntity<>(this.historyService.findOneHistoryById(history_id), HttpStatus.OK);
    }

    @PostMapping("/post")
    public @ResponseBody ResponseEntity<HistoryEntity> postHistory(@RequestBody HistoryEntity history) {
        return new ResponseEntity<>(this.historyService.saveHistory(history), HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public @ResponseBody ResponseEntity<HistoryEntity> putHistory(@RequestBody HistoryEntity history ) {
        return new ResponseEntity<>(this.historyService.updateHistory(history), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody ResponseEntity<String> deleteHistory(@PathVariable Long id) {
        this.historyService.deleteHistoryById(id);
        return new ResponseEntity<>(String.format("%d has delete.", id), HttpStatus.OK);
    }
}
