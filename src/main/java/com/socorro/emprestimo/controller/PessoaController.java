package com.socorro.emprestimo.controller;

import com.socorro.emprestimo.model.Pessoa;
import com.socorro.emprestimo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping
public class PessoaController {

  @Autowired
  private PessoaService pessoaService;

  @GetMapping
  public List<Pessoa> listAllPessoas(){
    return pessoaService.findAll();
  }

  @PostMapping@ResponseStatus(HttpStatus.CREATED)
  public String createPessoa (@RequestBody Pessoa pessoaBody){
    pessoaService.createPessoa(pessoaBody);
    return pessoaBody.getNome()+" Criado com sucesso";
  }
}
