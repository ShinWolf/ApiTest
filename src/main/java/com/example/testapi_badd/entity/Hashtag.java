package com.example.testapi_badd.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hashtag")
@Getter
@Setter
@NoArgsConstructor
public class Hashtag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libelle;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
