package com.example.gestiondesrh.dtos;

import com.example.gestiondesrh.entities.Recruteur;
import com.example.gestiondesrh.enums.OffreType;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class OffreDTO {

    private String domaine;
    private String imageUrl;
    private String description;
    private String ville;
    @Enumerated(EnumType.STRING)
    private OffreType type;

    private Recruteur recruteur;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private Date dateOffre;
}
