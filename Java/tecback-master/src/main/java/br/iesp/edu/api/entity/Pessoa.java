package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;

@Getter
@Setter
@Entity
public class Pessoa {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;

    @Email
    private String email;
    @CPF
    private String cpf;
    //OneToMany ou ManyToOne
    private Perfil perfil;
}
