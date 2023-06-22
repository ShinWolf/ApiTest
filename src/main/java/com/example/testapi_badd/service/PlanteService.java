package com.example.testapi_badd.service;

import com.example.testapi_badd.entity.Plante;
import com.example.testapi_badd.repository.PlanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanteService {

    private final PlanteRepository planteRepository;

    public Plante creationPlante(Plante plante){
        return this.planteRepository.save(plante);
    }

    public List<Plante> planteList() {
        return this.planteRepository.findAll();
    }

    public void spprimerPlante(Long id) {
        this.planteRepository.deleteById(id);
    }
}
