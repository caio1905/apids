package com.api.free.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.free.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Produto findById(long id);
}
