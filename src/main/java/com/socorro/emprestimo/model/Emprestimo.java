package com.socorro.emprestimo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Getter @Setter @Entity
public class Emprestimo {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private UUID id;
  private Float valor;
  private Integer num_parcelas;
  private Timestamp data_emprestimo;
  private String status;

  @OneToMany(mappedBy = "emprestimo", cascade = CascadeType.ALL)
  private List<Parcela> parcelas;

  @ManyToMany @JoinTable(name = "pessoa_emprestimo", joinColumns = { @JoinColumn(name = "id_emprestimo")}, inverseJoinColumns = {@JoinColumn(name = "id_pessoa")})
  private List<Pessoa> pessoas;
}
