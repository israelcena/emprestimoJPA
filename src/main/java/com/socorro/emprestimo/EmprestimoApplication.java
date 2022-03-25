package com.socorro.emprestimo;

import com.socorro.emprestimo.model.Pessoa;
import com.socorro.emprestimo.service.EmprestimoService;
import com.socorro.emprestimo.service.PessoaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmprestimoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmprestimoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo() {
		return (args) -> {
			System.out.println("Sistema Iniciado Com Sucesso");
		};
	}

}
