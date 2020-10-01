package br.com.infnet.model.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.model.negocio.Video;

@FeignClient(url = "http://localhost:8081/api", name = "videoClient")
public interface IVideoClient {
	
	@GetMapping(value = "/videos")
	public List<Video> obterLista();
	
	@GetMapping(value = "/video/{id}")
	public Video obterPorId(@PathVariable Integer id);

}
