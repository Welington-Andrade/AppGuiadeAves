package br.com.infnet.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.model.client.IImagemClient;
import br.com.infnet.model.negocio.Imagem;


@Service
public class ImagemService extends RegistroService{
	
@Autowired private IImagemClient imgClient;
	
	public List<Imagem> obterImagens(){
		return imgClient.obterLista();
	}
	
	public Imagem obterPorId(Integer id) {
		return imgClient.obterPorId(id);
	}

}
