package br.com.infnet.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.model.client.IObservadorClient;
import br.com.infnet.model.negocio.Observador;

@Service
public class ObservadorService {
	
	@Autowired
	private IObservadorClient observadorClient;
	
	public void incluir(Observador observador) {
		observadorClient.incluir(observador);
	}
	
	public List<Observador> obterLista() {
		return observadorClient.obterLista();
	}

	public void excluir(Integer id) {
		observadorClient.excluir(id);
	}

	public Observador obterPorId(Integer id) {
		return observadorClient.obterPorId(id);
	}

}
