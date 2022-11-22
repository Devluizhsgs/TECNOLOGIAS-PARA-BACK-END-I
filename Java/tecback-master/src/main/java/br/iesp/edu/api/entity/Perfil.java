package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Perfil {
    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private boolean restricaoIdade;
    @OneToMany
    @JoinColumn
    private List<Serie> seriesFavoritas;
    @OneToMany
    @JoinColumn()
    private List<Filme> filmesFavoritos;
}
