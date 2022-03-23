package com.socorro.emprestimo;

import com.socorro.emprestimo.model.Pessoa;
import com.socorro.emprestimo.repository.PessoaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class EmprestimoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmprestimoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PessoaRepository pessoaRepository) {
		return (args) -> {
			List<Pessoa> pessoas = pessoaRepository.findAll();
			pessoas.forEach(p -> System.out.println(p.getNome()));
		};
	}

}
