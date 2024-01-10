package com.example.gestiondesrh.repositories;

import com.example.gestiondesrh.entities.Offre;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.awt.print.Pageable;

//@CrossOrigin("*")
//@RepositoryRestResource
@Repository
public interface OffreRepository extends JpaRepository<Offre , Long> {
//    @RestResource(path ="/ByCategoriePage")
//    public Page<Offre> findByDomaineContains(@Param("mc") String mc , Pageable pageable);
}
