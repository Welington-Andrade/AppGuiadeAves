package br.com.infnet.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.infnet.model.negocio.Ave;
import br.com.infnet.model.negocio.Registro;
import br.com.infnet.model.service.AveService;
import br.com.infnet.model.service.ObservadorService;
import br.com.infnet.model.service.RegistroService;

@Controller
public class RegistroController {
	
	@Autowired private AveService aveService;
	@Autowired private RegistroService registroService;
	@Autowired private ObservadorService observadorService;
	
	@GetMapping(value = "/registro")
	public String novo(
				Model model
			) {
		System.out.println("entrou no registro");
		model.addAttribute("operacao", "inclusão");
		model.addAttribute("aves", aveService.obterLista());
		model.addAttribute("observadores", observadorService.obterLista());
		
		System.out.println("saiu do registro");
		return "registro/detalhe";
	}

	@GetMapping(value = "/registro/lista")
	public String lista(
				Model model
			) {
		model.addAttribute("registros", registroService.obterLista());
		System.out.println("Está aqui");
		
		return "registro/lista";
	}
	
	@PostMapping(value = "/registro/incluir")
	public String incluir(
				Model model,
				@RequestParam Optional<String[]> avesIds,
				Registro registro
			) {
		
		if(avesIds.isPresent()) {
			registro.setObservador(observadorService.obterPorId(registro.getObservador().getId()));
			
			List<Ave> lista = new ArrayList<Ave>();
			
			for(String id : avesIds.get()) {
				lista.add(aveService.obterPorId(Integer.valueOf(id)));
			}

			registroService.incluir(registro);

			return "redirect:/registro/lista";
		}

		model.addAttribute("msgError");
		
		return this.novo(model);
	}
	
	@GetMapping(value = "/registro/{id}/excluir")
	public String excluir(
				Model model,
				@PathVariable Integer id
			) {
		
		try {
			registroService.excluir(id);
		} catch (Exception e) {
			model.addAttribute("msgError", "Impossível realizar a exclusão: este item está sendo utilizado!!");
			return this.lista(model);
		}
		
		return "redirect:/registro/lista";
	}
	
	@GetMapping(value = "/registro/{id}/consultar")
	public String consultar(
				Model model,
				@PathVariable Integer id
			) {
		model.addAttribute("operacao", "consulta");
		
		model.addAttribute("registro", registroService.consultar(id));
		
		return "registro/consulta";
	}

}
