package com.example.testapi_badd.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Utilisateur")
@Getter
@Setter
@NoArgsConstructor
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "pseudo")
    private String pseudo;

    @Column(name = "email")
    private String email;

    @Column(name = "nom")
    private String nom;

    @Column(name = "password")
    private String password;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "code_postal")
    private String codePostal;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
