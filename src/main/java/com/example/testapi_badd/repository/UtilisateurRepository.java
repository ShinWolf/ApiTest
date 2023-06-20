package com.example.testapi_badd.repository;

import com.example.testapi_badd.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
