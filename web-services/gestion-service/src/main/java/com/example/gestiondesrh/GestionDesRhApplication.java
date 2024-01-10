package com.example.gestiondesrh;

import com.example.gestiondesrh.dtos.CondidatDTO;
import com.example.gestiondesrh.entities.Condidat;
import com.example.gestiondesrh.repositories.CondidatRepository;
import com.example.gestiondesrh.services.CondidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.stream.Stream;

@SpringBootApplication
@EnableJpaRepositories
public class GestionDesRhApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDesRhApplication.class, args);
	}
@Autowired
private CondidatRepository condidatRepository;
	@Bean
	CommandLineRunner commandLineRunner(CondidatService condidatService){
		return args -> {
			Stream.of("Hassan","Imane","Mohamed").forEach(name->{
				Condidat condidat = new Condidat();
				condidat.setNom(name);
				condidat.setEmail("buhnij,ok;pl");
				condidat.setPhonenumber("ubnij,ok");
				condidat.setPrenom("vygbuhnij");
				condidatRepository.save(condidat);
			});

		};

	}
	@Bean
	CommandLineRunner start(CondidatRepository condidatRepository){
		return 	args -> {
			Stream.of("Hassan","Yassine","Aicha").forEach(name->{
				Condidat customer=new Condidat();
				customer.setNom(name);
				customer.setPrenom(name);
				customer.setEmail(name+"@gmail.com");
				condidatRepository.save(customer);
			});
		};
	}}


