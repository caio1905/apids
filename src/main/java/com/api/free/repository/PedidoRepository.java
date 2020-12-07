package com.api.free.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.free.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

	Pedido findById(long id);
}
