package com.example.gestiondesrh.repositories;

import com.example.gestiondesrh.entities.Recruteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin("*")
//@RepositoryRestResource
@Repository
public interface RecruteurRepository extends JpaRepository<Recruteur, Long> {
}
