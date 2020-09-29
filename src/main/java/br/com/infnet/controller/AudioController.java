package br.com.infnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.infnet.model.negocio.Audio;
import br.com.infnet.model.service.AudioService;


@Controller
public class AudioController {
	
@Autowired private AudioService audService;
	
	@GetMapping(value = "/audio")
	public String novo(
				Model model
			) {
		model.addAttribute("operacao", "inclusão");
		
		return "audio/detalhe";
	}
	
	@GetMapping(value = "/audios")
	public String lista(
				Model model
			) {
		model.addAttribute("audios", audService.obterAudios());
		
		return "audio/lista";
	}
	
	@PostMapping(value = "/audio/incluir")
	public String incluir(
				Audio audio
			) {		
		audService.incluir(audio);
		
		return "redirect:/audios";
	}

	@GetMapping(value = "/audio/{id}/excluir")
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		try {
			audService.excluir(id);
		} catch (Exception e) {
			model.addAttribute("msgError", "Impossível realizar a exclusão: este item está sendo utilizado!!");
			return this.lista(model);
		}
		
		return "redirect:/audios";
	}
	
	@GetMapping(value = "/audio/{id}/alterar")
	public String alterar(
				Model model,
				@PathVariable Integer id
			) {
		
		model.addAttribute("audio", audService.obterPorId(id));
		model.addAttribute("operacao", "alteração");
		
		return "audio/detalhe";
	}

}
