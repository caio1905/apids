package com.api.free.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.free.model.Produto;
import com.api.free.repository.ProdutoRepository;


@CrossOrigin
@RestController
@RequestMapping("api/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repo;
	
	@RequestMapping(value = "/buscar", method = RequestMethod.GET)
	public List<Produto> buscar(){
		return repo.findAll();
	}
	
	@RequestMapping(value = "/buscar/{id}", method = RequestMethod.GET)
	public Produto buscarid(@PathVariable long id){
		return repo.findById(id);
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public Produto salvar(@RequestBody Produto produto) {
		return repo.save(produto);
	}
	
	@RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE)
	public void excluir(@PathVariable Long id) {
		repo.deleteById(id);
		
	}
	
	@RequestMapping(value = "/alterar", method = RequestMethod.PUT)
	public Produto alterar(@RequestBody Produto produto) {
		return repo.save(produto);
	}

}
