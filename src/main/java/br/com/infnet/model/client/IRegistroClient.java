package br.com.infnet.model.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.infnet.model.negocio.Registro;


@FeignClient(url = "http://localhost:8081/api/registro", name = "registroClient")
public interface IRegistroClient {
	
	@GetMapping(value = "/lista")
	public List<Registro> obterLista();
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Registro registro);

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);

	@GetMapping(value = "/{id}/consultar")
	public Registro consultar(@PathVariable Integer id);

}
