package br.com.infnet.model.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.infnet.model.negocio.Ave;



@FeignClient(url = "http://localhost:8081/api", name = "aveClient")
public interface IAveClient {
	
	@GetMapping(value = "/aves")
	public List<Ave> obterLista();
	
	@GetMapping(value = "/ave/{id}")
	public Ave obterPorId(@PathVariable Integer id);

	@PostMapping(value = "/ave/incluir")
	public void incluir(@RequestBody Ave ave);

	@DeleteMapping(value = "/ave/{id}/excluir")
	public void excluir(@PathVariable Integer id);

}
