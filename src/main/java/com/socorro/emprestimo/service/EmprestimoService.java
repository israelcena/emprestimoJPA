package com.socorro.emprestimo.service;

import com.socorro.emprestimo.model.Emprestimo;
import com.socorro.emprestimo.repository.EmprestimoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmprestimoService {

  private final EmprestimoRepository emprestimoRepository;

  public void buscaEmprestimos(){
    List<Emprestimo> emprestimos = emprestimoRepository.findAll();
    emprestimos.forEach(emprestimo -> System.out.println(emprestimo.getValor()));
  }


}
