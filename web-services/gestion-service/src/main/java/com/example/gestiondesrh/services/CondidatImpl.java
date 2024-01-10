package com.example.gestiondesrh.services;

import com.example.gestiondesrh.dtos.CondidatDTO;
import com.example.gestiondesrh.entities.Condidat;
import com.example.gestiondesrh.entities.Cvs;
import com.example.gestiondesrh.mappers.CondidatMapper;
import com.example.gestiondesrh.repositories.CondidatRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class CondidatImpl implements CondidatService{
    private CondidatRepository condidatRepository;

    private CondidatMapper condidatMapper;


    @Override
    public Condidat saveCondidat(CondidatDTO condidatDTO) {
        log.info("Saving new Condidat");
        Condidat condidat= condidatMapper.fromCondidatDTO(condidatDTO);
        Condidat savedCustomer = condidatRepository.save(condidat);
        return savedCustomer;
    }

    @Override
    public void addCondidat(CondidatDTO condidatDTO) {
        this.condidatRepository.save(this.condidatMapper.fromCondidatDTO(condidatDTO));
    }

    @Override
    public CondidatDTO getCondidatById(Long id) {
        Optional<Condidat> condidatOptional = condidatRepository.findById(id);
        return condidatOptional.map(condidatMapper::fromCondidat).orElse(null);
    }

    @Override
    public List<CondidatDTO> getAllCondidats() {
        List<Condidat> condidats = condidatRepository.findAll();
        return condidats.stream()
                .map(condidatMapper::fromCondidat)
                .collect(Collectors.toList());
    }

    @Override
    public CondidatDTO createCondidat(CondidatDTO condidatDTO) {
        Condidat condidat = condidatMapper.fromCondidatDTO(condidatDTO);
        Condidat savedCondidat = condidatRepository.save(condidat);
        return condidatMapper.fromCondidat(savedCondidat);
    }

    @Override
    public CondidatDTO updateCondidat(Long id, CondidatDTO condidatDTO) {
        Optional<Condidat> condidatOptional = condidatRepository.findById(id);
        if (condidatOptional.isPresent()) {
            Condidat existingCondidat = condidatOptional.get();
            existingCondidat.setNom(condidatDTO.getNom());
            existingCondidat.setPrenom(condidatDTO.getPrenom());
            existingCondidat.setPhonenumber(condidatDTO.getPhonenumber());
            existingCondidat.setEmail(condidatDTO.getEmail());

            // Assuming that the CondidatDTO also contains information about the associated Cvs
            // If not, you may need additional logic to update Cvs information

            /*Cvs existingCvs = existingCondidat.getCv();
            // Assuming CondidatDTO has information about Cvs
            Cvs updatedCvs = condidatMapper.fromCondidatDTO(condidatDTO.getCvDTO());

            // Update Cvs information
            if (existingCvs != null) {
                existingCvs.setSomeCvsProperty(updatedCvs.getSomeCvsProperty());
                // Update other properties as needed
            } else {
                // If Cvs is null, you may want to create a new Cvs entity and associate it with Condidat
                existingCondidat.setCv(updatedCvs);
            }*/

            Condidat updatedCondidat = condidatRepository.save(existingCondidat);
            return condidatMapper.fromCondidat(updatedCondidat);
        }
        return null; // Handle not found scenario
    }

    @Override
    public void deleteCondidat(Long id) {
        condidatRepository.deleteById(id);
    }





}
