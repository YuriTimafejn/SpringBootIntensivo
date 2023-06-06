package com.timafejn.controle_filmes.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estudio")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;


}
