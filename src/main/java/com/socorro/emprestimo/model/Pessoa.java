package com.socorro.emprestimo.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter @Setter @Entity(name = "pessoa") @Builder @RequiredArgsConstructor @AllArgsConstructor
public class Pessoa {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String nome;
  private String cpf;
  private Float salario;
  private String endereco;

  @ManyToMany(mappedBy = "pessoas", fetch=FetchType.EAGER)
  private List<Emprestimo> emprestimos;

}
