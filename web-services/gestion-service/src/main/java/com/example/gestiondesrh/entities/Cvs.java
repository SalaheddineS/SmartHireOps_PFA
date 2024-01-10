package com.example.gestiondesrh.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cvs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cv;

    @OneToOne
    private Condidat condidat;
}
