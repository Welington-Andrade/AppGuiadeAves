package br.com.infnet.model.negocio;

import java.util.List;

public class Observador {
	
	private Integer id;
	private String nome;
	private Integer idade;
	private List<Registro> registros;
	
	public Observador() {
	}

	public Observador(Integer id, String nome, Integer idade, List<Registro> registros) {
		this();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.registros = registros;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}	
	
}
