package com.example.gestiondesrh.mappers;

import com.example.gestiondesrh.dtos.CondidatDTO;
import com.example.gestiondesrh.entities.Condidat;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CondidatMapper {
    public CondidatDTO fromCondidat(Condidat condidat){
        CondidatDTO condidatDTO=new CondidatDTO();
        BeanUtils.copyProperties(condidat,condidatDTO);
        return  condidatDTO;
    }
    public Condidat fromCondidatDTO(CondidatDTO condidatDTO){
        Condidat condidat=new Condidat();
        BeanUtils.copyProperties(condidatDTO,condidat);
        return  condidat;
    }
}
