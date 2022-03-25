package com.socorro.emprestimo.service;

import com.socorro.emprestimo.model.Pessoa;
import com.socorro.emprestimo.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class PessoaService {

  private final PessoaRepository pessoaRepository;

  public void findAll(){
    List<Pessoa> pessoaList = pessoaRepository.findAll();
    pessoaList.forEach(pessoa -> System.out.println(pessoa.getNome()));
  }

  public void createPessoa(Pessoa pessoa){
    pessoaRepository.save(pessoa);
  }
}
