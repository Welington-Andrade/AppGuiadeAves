package br.com.infnet.model.negocio;

import java.time.LocalDateTime;

public class Registro {
	
	private Integer id;
	private String local;
	private LocalDateTime date;
	private Observador observador;
	
	public Registro() {
	}

	public Registro(Integer id, String local, LocalDateTime date, Observador observador) {
		this();
		this.id = id;
		this.local = local;
		this.date = date;
		this.observador = observador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Observador getObservador() {
		return observador;
	}

	public void setObservador(Observador observador) {
		this.observador = observador;
	}	

}
