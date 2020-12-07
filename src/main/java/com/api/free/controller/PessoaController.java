package com.api.free.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.free.model.Pessoa;
import com.api.free.repository.PessoaRepository;

@CrossOrigin
@RestController
@RequestMapping("api/pessoa")
public class PessoaController {

	@Autowired
	private PessoaRepository repo;
	
	@RequestMapping(value = "/buscar", method = RequestMethod.GET)
	public List<Pessoa> buscar(){
		return repo.findAll();
	}
	
	@RequestMapping(value = "/buscar/{id}", method = RequestMethod.GET)
	public Pessoa buscarId(@PathVariable long id) {
		return repo.findById(id);
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public Pessoa salvar(@RequestBody Pessoa pessoa) {
		return repo.save(pessoa);
	}
	
	@RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE)
	public void excluir(@PathVariable Long id) {
		repo.deleteById(id);
		
	}
	
	@RequestMapping(value = "/alterar", method = RequestMethod.PUT)
	public Pessoa alterar(@RequestBody Pessoa pessoa) {
		return repo.save(pessoa);
	}
}
