package br.com.infnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.model.service.AveService;

@Controller
public class AveController {
	
	@Autowired private AveService aveService;
	
	@GetMapping(value = "/aves")
	public String lista(
				Model model
			) {
		model.addAttribute("aves", aveService.obterLista());
		
		return "ave/lista";
	}

	@GetMapping(value = "/ave/{id}/excluir")
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		try {
			aveService.excluir(id);
		} catch (Exception e) {
			model.addAttribute("msgError", "Impossível realizar a exclusão: este item está sendo utilizado!!");
			return this.lista(model);
		}
		
		return "redirect:/aves";
	}
}
