package br.com.infnet.model.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.infnet.model.negocio.Observador;


@FeignClient(url = "http://localhost:8081/api/registro", name = "observadorClient")
public interface IObservadorClient {
	
	@GetMapping(value = "/observadores")
	public List<Observador> obterLista();
	
	@GetMapping(value = "/observador/{id}")
	public Observador obterPorId(@PathVariable Integer id);

	@PostMapping(value = "/observador/incluir")
	public void incluir(Observador solicitante);
	
	@GetMapping(value = "/observador/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value = "/observador/{id}/alterar")
	public void alterar(@PathVariable Integer id);

}
