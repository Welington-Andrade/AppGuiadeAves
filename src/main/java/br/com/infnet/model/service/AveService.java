package br.com.infnet.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.model.client.IAveClient;
import br.com.infnet.model.negocio.Ave;
import feign.FeignException;



@Service
public class AveService {
	
	@Autowired private IAveClient aveClient;
	
	public List<Ave> obterLista(){
		
		try {
			return aveClient.obterLista();
		} catch (FeignException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void excluir(Integer id) {
		aveClient.excluir(id);
	}
	
	public Ave obterPorId(Integer id) {
		return aveClient.obterPorId(id);
	}

	public void incluir(Ave ave) {
		aveClient.incluir(ave);
	}
}
