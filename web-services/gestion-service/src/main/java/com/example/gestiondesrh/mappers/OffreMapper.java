package com.example.gestiondesrh.mappers;

import com.example.gestiondesrh.dtos.OffreDTO;
import com.example.gestiondesrh.entities.Offre;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class OffreMapper {
    public OffreDTO fromOffre(Offre offre){
        OffreDTO offreDTO=new OffreDTO();
        BeanUtils.copyProperties(offre,offreDTO);
        return  offreDTO;
    }
    public  Offre fromOffreDTO(OffreDTO offreDTO){
        Offre offre = new Offre();
        BeanUtils.copyProperties(offreDTO,offre);
        return offre;
    }
}
