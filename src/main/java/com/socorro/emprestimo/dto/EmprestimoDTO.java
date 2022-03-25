package com.socorro.emprestimo.dto;

import com.socorro.emprestimo.model.Emprestimo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;

@Getter @Setter @AllArgsConstructor @Builder
public class EmprestimoDTO {
  private Float valor;
  private Integer num_parcelas;
  private LocalDateTime data_emprestimo;
  private String status;

  public static EmprestimoDTO convert(){
    ModelMapper modelMapper = new ModelMapper();
    return modelMapper.map(Emprestimo.class, EmprestimoDTO.class);
  }
}
