package com.example.gestiondesrh.services;

import com.example.gestiondesrh.dtos.OffreDTO;

import java.util.List;

public interface OffreService {
    OffreDTO getOffreById(Long id);
    List<OffreDTO> getAllOffres();
    OffreDTO createOffre(OffreDTO offreDTO);
}
