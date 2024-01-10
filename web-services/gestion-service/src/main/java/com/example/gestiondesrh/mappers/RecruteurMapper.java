package com.example.gestiondesrh.mappers;

import com.example.gestiondesrh.dtos.RecruteurDTO;
import com.example.gestiondesrh.entities.Recruteur;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class RecruteurMapper {
    public RecruteurDTO fromRecruteur(Recruteur recruteur){
        RecruteurDTO recruteurDTO=new RecruteurDTO();
        BeanUtils.copyProperties(recruteur,recruteurDTO);
        return  recruteurDTO;
    }
    public Recruteur fromRecruteurDTO(RecruteurDTO recruteurDTO){
        Recruteur recruteur=new Recruteur();
        BeanUtils.copyProperties(recruteurDTO,recruteur);
        return  recruteur;
    }
}
