package br.com.infnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.infnet.model.negocio.Usuario;
import br.com.infnet.model.service.UsuarioService;


@Controller
public class UsuarioController {
	
	@Autowired 
	private UsuarioService usuarioService;

	@RequestMapping(value = "/usuario/incluir", method = RequestMethod.POST)
	public String incluir(
				Model model,
				Usuario usuario
			) {
		
		usuarioService.incluir(usuario);
		
		return "login";
	}
	
	@GetMapping("/user")
	public String showDetalhe() {
		return "usuario/detalhe";
	}

}
