package br.com.infnet.model.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.model.negocio.Audio;


@FeignClient(url = "http://localhost:8081/api", name = "audClient")
public interface IAudioClient {
	
	@GetMapping(value = "/audios")
	public List<Audio> obterLista();
	
	@GetMapping(value = "/audio/{id}")
	public Audio obterPorId(@PathVariable Integer id);

}
