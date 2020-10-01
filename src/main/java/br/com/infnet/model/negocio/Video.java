package br.com.infnet.model.negocio;

import java.time.LocalDateTime;

public class Video extends Registro{
	
	private Integer id;
	private Ave ave;
	
	public Video() {
	}
	
	public Video(Integer id, Ave ave) {
		this();
		this.setId(id);
		this.setAve(ave);
	}
	
	public Video(Integer id, String nome, String local, LocalDateTime date, Observador observador, Ave ave) {
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
