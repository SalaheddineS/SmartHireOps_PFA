package com.example.gestiondesrh.repositories;

import com.example.gestiondesrh.entities.Condidat;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.awt.print.Pageable;
import java.util.List;

//@CrossOrigin("*")
//@RepositoryRestResource
@Repository
public interface CondidatRepository extends JpaRepository<Condidat, Long> {
    //List<Condidat> findByAccountId(String accountId);
    //Page<Condidat> findByBankAccountIdOrderByOperationDateDesc(String accountId, Pageable pageable);
}
