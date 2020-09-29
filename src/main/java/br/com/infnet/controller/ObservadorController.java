package br.com.infnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.infnet.model.negocio.Observador;
import br.com.infnet.model.service.ObservadorService;


@Controller
public class ObservadorController {
	
@Autowired private ObservadorService obsService;
	
	@GetMapping(value = "/observador")
	public String novo(
				Model model
			) {
		model.addAttribute("operacao", "inclusão");
		
		return "observador/detalhe";
	}
	
	@GetMapping(value = "/observadores")
	public String lista(
				Model model
			) {
		model.addAttribute("observadores", obsService.obterLista()); 
		
		return "observador/lista";
	}
	
	@PostMapping(value = "/observador/incluir")
	public String incluir(
			Observador observador
			) {
		
		obsService.incluir(observador);
		
		return "redirect:/observadores";
	}
	
	@GetMapping(value = "/observador/{id}/excluir")
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		try {
			obsService.excluir(id);
		} catch (Exception e) {
			model.addAttribute("msgError", "Impossível realizar a exclusão: este item está sendo utilizado!!");
			return this.lista(model);
		}
		
		return "redirect:/observadores";
	}
	
	@GetMapping(value = "/observador/{id}/alterar")
	public String alterar(
				Model model,
				@PathVariable Integer id
			) {
		model.addAttribute("operacao", "alteração");
		
		model.addAttribute("observador", obsService.obterPorId(id));
		
		return "observador/detalhe";
	}

}
