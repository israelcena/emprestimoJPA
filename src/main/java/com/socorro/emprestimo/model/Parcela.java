package com.socorro.emprestimo.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter @Setter @Entity
public class Parcela {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Float valor;
  private Integer num;
  private String status;
  @Column(name = "data_pagamento")
  private LocalDateTime dataPgto;

  @ManyToOne
  @JoinColumn(name = "id_ emprestimo")
  private Emprestimo emprestimo;
}
