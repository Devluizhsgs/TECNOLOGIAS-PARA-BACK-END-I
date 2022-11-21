package br.iesp.edu.api.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Perfil {
    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private boolean restricaoIdade;
    //OneToMany ou ManyToOne
    private Serie seriesFavoritas;
    //OneToMany ou ManyToOne
    private Filme filmesFavoritos;
}
