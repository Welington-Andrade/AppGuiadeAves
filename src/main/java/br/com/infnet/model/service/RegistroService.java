package br.com.infnet.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.model.client.IRegistroClient;
import br.com.infnet.model.negocio.Registro;

@Service
public class RegistroService {
	
	@Autowired private IRegistroClient registroClient;
	
	public void incluir(Registro registro) {
		registroClient.incluir(registro);
	}
	
	public List<Registro> obterLista(){
		return registroClient.obterLista();
	}

	public Registro consultar(Integer id) {
		return registroClient.consultar(id);
	}

	public void excluir(Integer id) {
		registroClient.excluir(id);
	}

}
