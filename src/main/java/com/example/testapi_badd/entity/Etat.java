package com.example.testapi_badd.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Etat")
@Getter
@Setter
@NoArgsConstructor
public class Etat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libelle;

    private LocalDateTime dateDebut;

    private LocalDateTime dateFin;

    @OneToMany(mappedBy = "etat")
    private List<Plante> plantes;
}
