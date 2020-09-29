package br.com.infnet.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.model.client.IAudioClient;
import br.com.infnet.model.negocio.Audio;

@Service
public class AudioService extends RegistroService{
	
@Autowired private IAudioClient audClient;
	
	public List<Audio> obterAudios(){
		return audClient.obterLista();
	}
	
	public Audio obterPorId(Integer id) {
		return audClient.obterPorId(id);
	}

}
