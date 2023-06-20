package com.example.testapi_badd.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "plante")
@Getter
@Setter
@NoArgsConstructor
public class Plante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String photo;

    private String description;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "etat_id")
    private Etat etat;
}
