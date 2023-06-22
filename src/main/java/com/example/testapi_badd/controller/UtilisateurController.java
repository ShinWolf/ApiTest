package com.example.testapi_badd.controller;

import com.example.testapi_badd.entity.Utilisateur;
import com.example.testapi_badd.service.RoleService;
import com.example.testapi_badd.service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/user")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;
    private final RoleService roleService;

    @PostMapping(path = "/create")
    public Utilisateur creation(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.creationUtilisateur(utilisateur);
    }

    @GetMapping(path = "/listUser")
    public List<Utilisateur> utilisateurs() {
        return utilisateurService.listUtilisateurs();
    }

    @PutMapping(path = "/update/{id}")
    public Utilisateur update(@PathVariable Long id, Utilisateur utilisateur) {
        return utilisateurService.modifierUtilisateur(id, utilisateur);
    }

    @DeleteMapping(path = "/delete/{id}")
    public String delete(@PathVariable Long id) {
        return utilisateurService.supprimerUtilisateur(id);
    }


}
