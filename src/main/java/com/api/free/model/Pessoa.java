package com.api.free.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity //Definir a entidade
@Table(name = "pessoa") //@table define a tabela, (name) altera o nome da tabela no BD
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id //Identificador de tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Geração de chave primária
	private long id;
	
	@OneToMany
	private List<Pedido> pedido;
	
	private String nome;
	
	private String cpf;
	
	private String senha;
	
	private String endereco;
	
	private String telefone;
	
	private String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
