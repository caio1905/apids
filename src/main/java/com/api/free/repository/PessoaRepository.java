package com.api.free.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.free.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	Pessoa findById(long id);
}
