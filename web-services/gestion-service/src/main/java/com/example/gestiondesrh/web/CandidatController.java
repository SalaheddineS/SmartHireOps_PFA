package com.example.gestiondesrh.web;

import com.example.gestiondesrh.dtos.CondidatDTO;
import com.example.gestiondesrh.entities.Condidat;
import com.example.gestiondesrh.services.CondidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/condidats")
public class CandidatController {
    @Autowired
    private CondidatService condidatService;
    @PostMapping("/candidats")
    public Condidat saveCondidat(CondidatDTO condidatDTO){
        return condidatService.saveCondidat(condidatDTO);
    }

    @GetMapping
    public ResponseEntity<List<CondidatDTO>> getAllCondidats() {
        List<CondidatDTO> condidats = condidatService.getAllCondidats();
        return new ResponseEntity<>(condidats, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CondidatDTO> getCondidatById(@PathVariable Long id) {
        CondidatDTO condidatDTO = condidatService.getCondidatById(id);
        return condidatDTO != null
                ? new ResponseEntity<>(condidatDTO, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<CondidatDTO> createCondidat(@RequestBody CondidatDTO condidatDTO) {
        CondidatDTO createdCondidat = condidatService.createCondidat(condidatDTO);
        return new ResponseEntity<>(createdCondidat, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CondidatDTO> updateCondidat(@PathVariable Long id, @RequestBody CondidatDTO condidatDTO) {
        CondidatDTO updatedCondidat = condidatService.updateCondidat(id, condidatDTO);
        return updatedCondidat != null
                ? new ResponseEntity<>(updatedCondidat, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCondidat(@PathVariable Long id) {
        condidatService.deleteCondidat(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
