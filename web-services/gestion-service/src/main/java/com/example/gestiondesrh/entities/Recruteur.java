package com.example.gestiondesrh.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recruteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nom;
    private String prenom;
    private String email;

    @OneToMany(mappedBy = "recruteur")
    private Collection<Offre> offres;
}
