package br.com.infnet.model.negocio;

import java.time.LocalDateTime;

public class Imagem extends Registro{
	
	private Integer id;
	private Ave ave;
	
	public Imagem() {
	}
	
	public Imagem(Integer id, Ave ave) {
		this();
		this.setId(id);
		this.setAve(ave);
	}
	
	public Imagem(Integer id, String nome, String local, LocalDateTime date, Observador observador, Ave ave) {
		super(id, nome, local, date, observador, ave);
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Ave getAve() {
		return ave;
	}
	
	public void setAve(Ave ave) {
		this.ave = ave;
	}

}
