package com.socorro.emprestimo.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter @Setter @Entity @Builder @AllArgsConstructor
@RequiredArgsConstructor
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
