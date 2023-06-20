package com.example.testapi_badd.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "commentaire")
@Getter
@Setter
@NoArgsConstructor
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenue;

    private LocalDateTime dateCommentaire;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
