package br.com.infnet.model.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.model.negocio.Imagem;


@FeignClient(url = "http://localhost:8081/api/registro", name = "imgClient")
public interface IImagemClient {
	
	@GetMapping(value = "/imagens")
	public List<Imagem> obterLista();
	
	@GetMapping(value = "/imagem/{id}")
	public Imagem obterPorId(@PathVariable Integer id);

}
