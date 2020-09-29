package br.com.infnet.model.negocio;

public class Imagem extends Registro{
	
	private Integer id;
	private Ave ave;
	
	public Imagem() {
	}
	
	public Imagem(Integer id) {
		this();
		this.setId(id);
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
