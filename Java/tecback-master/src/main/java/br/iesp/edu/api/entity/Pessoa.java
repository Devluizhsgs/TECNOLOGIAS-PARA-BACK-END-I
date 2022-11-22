package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

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
    @OneToMany
    private List<Perfil> perfil;
}
