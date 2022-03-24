package com.socorro.emprestimo.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter @Entity @Builder @AllArgsConstructor
@RequiredArgsConstructor
public class Emprestimo {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Float valor;
  private Integer num_parcelas;
  private LocalDateTime data_emprestimo;
  private String status;

  @OneToMany(mappedBy = "emprestimo", cascade = CascadeType.ALL)
  private List<Parcela> parcelas;

  @ManyToMany @JoinTable(
      name = "pessoa_emprestimo",
      joinColumns = { @JoinColumn(name = "id_emprestimo")},
      inverseJoinColumns = {@JoinColumn(name = "id_pessoa")})
  private List<Pessoa> pessoas;
}
