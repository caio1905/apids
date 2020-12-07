package com.api.free.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.free.model.Pedido;
import com.api.free.repository.PedidoRepository;

@CrossOrigin
@RestController
@RequestMapping("api/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	@RequestMapping(value = "/buscar", method = RequestMethod.GET)
	public List<Pedido> buscar(){
		return pedidoRepository.findAll();
	}
	
	@RequestMapping(value = "/buscar/{id}", method = RequestMethod.GET)
	public Pedido buscarId(@PathVariable long id) {
		return pedidoRepository.findById(id);
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public Pedido salvar(@RequestBody Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	@RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE)
	public void excluir(@PathVariable Long id) {
		pedidoRepository.deleteById(id);
		
	}
	
	@RequestMapping(value = "/alterar", method = RequestMethod.PUT)
	public Pedido alterar(@RequestBody Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
}
