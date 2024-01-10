package com.example.gestiondesrh.services;

import com.example.gestiondesrh.dtos.CondidatDTO;
import com.example.gestiondesrh.entities.Condidat;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.List;

@Service

public interface CondidatService {
    Condidat saveCondidat(CondidatDTO condidatDTO);
    void addCondidat(CondidatDTO condidatDTO);
    CondidatDTO getCondidatById(Long id);
    List<CondidatDTO> getAllCondidats();
    CondidatDTO createCondidat(CondidatDTO condidatDTO);
    CondidatDTO updateCondidat(Long id, CondidatDTO condidatDTO);
    void deleteCondidat(Long id);

}
