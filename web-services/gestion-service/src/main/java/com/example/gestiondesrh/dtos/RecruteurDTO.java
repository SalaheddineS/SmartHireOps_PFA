package com.example.gestiondesrh.dtos;

import com.example.gestiondesrh.entities.Offre;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Collection;
@Data
public class RecruteurDTO {
    private String nom;
    private String prenom;
    private String email;
    private Collection<Offre> offres;
}
