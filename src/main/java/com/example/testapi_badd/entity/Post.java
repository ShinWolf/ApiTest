package com.example.testapi_badd.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "post")
@Getter
@Setter
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date_post")
    private LocalDateTime datePost;

    @Column(name = "texte")
    private String texte;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "post")
    private List<Hashtag> hashtags;

    @OneToMany(mappedBy = "post")
    private List<Commentaire> commentaires;

    @ManyToOne
    @JoinColumn(name = "plante_id")
    private Plante plante;
}
