package org.example.model;

import jakarta.persistence.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j //escrever log
@Entity
@Table(name = "PROFESSOR")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
