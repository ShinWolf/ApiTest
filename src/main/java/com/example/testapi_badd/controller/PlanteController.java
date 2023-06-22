package com.example.testapi_badd.controller;

import com.example.testapi_badd.entity.Plante;
import com.example.testapi_badd.service.PlanteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/plante")
public class PlanteController {

    private final PlanteService planteService;

    @PostMapping(path = "create")
    public Plante creation(@RequestBody Plante plante) {
        System.out.println(plante);
        return this.planteService.creationPlante(plante);
    }

    @GetMapping(path = "/listPlante")
    public List<Plante> getPlanteList() {
        return this.planteService.planteList();
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable Long id) {
        planteService.spprimerPlante(id);
    }
}
