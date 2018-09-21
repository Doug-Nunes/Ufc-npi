package br.ufc.npi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PrincipalController {
	
	@RequestMapping(path="/")
	public String index () {
		return "index";
	}
	
	
}
