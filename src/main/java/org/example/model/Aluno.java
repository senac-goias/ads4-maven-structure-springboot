package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ALUNO")
public class Aluno {

    //@Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //@Getter
    //@Setter
    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;

    private String endereco;

    private String telefone;

    private boolean ativo;

}
