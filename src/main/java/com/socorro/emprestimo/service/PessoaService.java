package com.socorro.emprestimo.service;

import com.socorro.emprestimo.model.Pessoa;
import com.socorro.emprestimo.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service @RequiredArgsConstructor
public class PessoaService {

  private final PessoaRepository pessoaRepository;

  public List<Pessoa> findAll(){
    List<Pessoa> pessoas = pessoaRepository.findAll();
    return pessoas;
  }

  public void createPessoa(Pessoa pessoa){
    pessoaRepository.save(pessoa);
  }
}
