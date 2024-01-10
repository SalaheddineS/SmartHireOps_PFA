package com.example.gestiondesrh.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Condidat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_condidat;
    private String nom;
    private String prenom;
    private String phonenumber;
    private String email;
    @OneToOne
    private Cvs cv;

}
