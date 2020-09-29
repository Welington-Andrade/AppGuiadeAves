package br.com.infnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class AppController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showInit() {
		return "login";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showHome() {
		return "home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin() {
		return "login";
	}
	
	@RequestMapping(value = "/acessoadmin", method = RequestMethod.GET)
	public String showError() {
		return "error";
	}
}