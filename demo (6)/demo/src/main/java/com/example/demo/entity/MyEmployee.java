package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class MyEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;

    @OneToMany(mappedBy = "employe", cascade = CascadeType.ALL)
    private Set<Skill> skills;

    @Enumerated(EnumType.STRING)
    private Post post;

    @ManyToMany(mappedBy = "employes")
    private Set<Project> projets;


}

