package br.com.infnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.infnet.model.negocio.Imagem;
import br.com.infnet.model.service.ImagemService;


@Controller
public class ImagemController {
	
@Autowired private ImagemService imgService;
	
	@GetMapping(value = "/imagem")
	public String novo(
				Model model
			) {
		model.addAttribute("operacao", "inclusão");
		
		return "imagem/detalhe";
	}
	
	@GetMapping(value = "/imagens")
	public String lista(
				Model model
			) {
		model.addAttribute("imagens", imgService.obterImagens());
		
		return "imagem/lista";
	}
	
	@PostMapping(value = "/imagem/incluir")
	public String incluir(
				Imagem imagem
			) {		
		imgService.incluir(imagem);
		
		return "redirect:/imagens";
	}

	@GetMapping(value = "/imagem/{id}/excluir")
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		try {
			imgService.excluir(id);
		} catch (Exception e) {
			model.addAttribute("msgError", "Impossível realizar a exclusão: este item está sendo utilizado!!");
			return this.lista(model);
		}
		
		return "redirect:/imagens";
	}
	
	@GetMapping(value = "/imagem/{id}/alterar")
	public String alterar(
				Model model,
				@PathVariable Integer id
			) {
		
		model.addAttribute("imagem", imgService.obterPorId(id));
		model.addAttribute("operacao", "alteração");
		
		return "imagem/detalhe";
	}

}
