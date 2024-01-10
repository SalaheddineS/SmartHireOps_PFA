package com.example.gestiondesrh.services;

import com.example.gestiondesrh.dtos.RecruteurDTO;

import java.util.List;

public interface RecruteurService {
    RecruteurDTO getRecruteurById(Long id);
    List<RecruteurDTO> getAllRecruteurs();
    RecruteurDTO createRecruteur(RecruteurDTO recruteurDTO);
}
