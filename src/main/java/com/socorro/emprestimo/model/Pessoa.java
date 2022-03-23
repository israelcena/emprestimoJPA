package com.socorro.emprestimo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter @Setter @Entity(name = "pessoa")
public class Pessoa {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private UUID id;
  private String nome;
  private String cpf;
  private Float salario;
  private String endereco;

  @ManyToMany(mappedBy = "pessoas", fetch =FetchType.EAGER)
  private List<Emprestimo> emprestimos;
}
