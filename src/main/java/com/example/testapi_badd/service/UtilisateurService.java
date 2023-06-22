package com.example.testapi_badd.service;

import com.example.testapi_badd.entity.Utilisateur;
import com.example.testapi_badd.repository.UtilisateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;
    public Utilisateur creationUtilisateur(Utilisateur utilisateur){
        return utilisateurRepository.save(utilisateur);
    }

    public List<Utilisateur> listUtilisateurs(){
        return utilisateurRepository.findAll();
    }

    public Utilisateur modifierUtilisateur(Long id, Utilisateur utilisateur){
        Utilisateur utilisateurExistant = utilisateurRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Utilisateur introuvable avec l'ID : " + id));

        utilisateurExistant.setPseudo(utilisateur.getPseudo());
        utilisateurExistant.setNom(utilisateur.getNom());
        utilisateurExistant.setPrenom(utilisateur.getPrenom());
        utilisateurExistant.setCodePostal(utilisateur.getCodePostal());

        return utilisateurRepository.save(utilisateurExistant);
    }

    public String supprimerUtilisateur(Long id){
        utilisateurRepository.deleteById(id);
        return "Utilisateur supprimé";
    }

    public Utilisateur verifUtilisateur(String pseudo, String password) {
        try {
            System.out.println(this.utilisateurRepository.findByPseudoAndPassword(pseudo, password));
            return this.utilisateurRepository.findByPseudoAndPassword(pseudo, password);
        } catch (Exception e) {
            System.out.println("Aucun utilisateurS");
            return null;
        }
    }

    public Optional<Utilisateur> getUserById(Long id) {
        try {
            System.out.println(this.utilisateurRepository.findById(id));
            return this.utilisateurRepository.findById(id);
        } catch (Exception e) {
            System.out.println("Aucun utilisateurS");
            return null;
        }
    }
}
