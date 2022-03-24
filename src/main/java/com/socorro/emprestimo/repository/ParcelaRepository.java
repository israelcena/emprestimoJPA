package com.socorro.emprestimo.repository;

import com.socorro.emprestimo.model.Parcela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelaRepository extends JpaRepository<Parcela, Integer> {
}
