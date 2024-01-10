package com.example.gestiondesrh.entities;

import com.example.gestiondesrh.enums.OffreType;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Offre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_offre;
    private String domaine;
    private String description;
    private String ville;
    @Enumerated(EnumType.STRING)
    private OffreType type;
    @ManyToOne
    private Recruteur recruteur;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private Date dateOffre;

}
