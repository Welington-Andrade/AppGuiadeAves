package br.com.infnet.model.negocio;

public class Video extends Registro{
	
	private Integer id;
	private Ave ave;
	
	public Video() {
	}
	
	public Video(Integer id) {
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
