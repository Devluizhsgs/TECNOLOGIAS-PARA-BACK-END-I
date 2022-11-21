package br.iesp.edu.api.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Legenda {
    @Id
    @GeneratedValue
    private Integer id;
    private String sinopse;
}
