package br.com.infnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.infnet.model.negocio.Video;
import br.com.infnet.model.service.VideoService;


@Controller
public class VideoController {
	
@Autowired private VideoService videoService;
	
	@GetMapping(value = "/video")
	public String novo(
				Model model
			) {
		model.addAttribute("operacao", "inclusão");
		
		return "video/detalhe";
	}
	
	@GetMapping(value = "/videos")
	public String lista(
				Model model
			) {
		model.addAttribute("videos", videoService.obterVideos());
		
		return "video/lista";
	}
	
	@PostMapping(value = "/video/incluir")
	public String incluir(
				Video video
			) {		
		videoService.incluir(video);
		
		return "redirect:/videos";
	}

	@GetMapping(value = "/video/{id}/excluir")
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		try {
			videoService.excluir(id);
		} catch (Exception e) {
			model.addAttribute("msgError", "Impossível realizar a exclusão: este item está sendo utilizado!!");
			return this.lista(model);
		}
		
		return "redirect:/videos";
	}
	
	@GetMapping(value = "/video/{id}/alterar")
	public String alterar(
				Model model,
				@PathVariable Integer id
			) {
		
		model.addAttribute("video", videoService.obterPorId(id));
		model.addAttribute("operacao", "alteração");
		
		return "video/detalhe";
	}

}
