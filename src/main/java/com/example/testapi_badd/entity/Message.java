package com.example.testapi_badd.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "message")
@Getter
@Setter
@NoArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "utilisateur_emetteur_id")
    private Utilisateur emetteur;

    @ManyToOne
    @JoinColumn(name = "utilisateur_destinataire_id")
    private Utilisateur destinataire;

    @Column(name = "contenu")
    private String contenu;

    @Column(name = "date_message")
    private LocalDateTime dateMessage;
}
