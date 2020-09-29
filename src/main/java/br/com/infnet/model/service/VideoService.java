package br.com.infnet.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.model.client.IVideoClient;
import br.com.infnet.model.negocio.Video;

@Service
public class VideoService extends RegistroService{
	
@Autowired private IVideoClient videoClient;
	
	public List<Video> obterVideos(){
		return videoClient.obterLista();
	}
	
	public Video obterPorId(Integer id) {
		return videoClient.obterPorId(id);
	}

}
