package com.timafejn.controle_filmes.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "genero")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String genero;
}
