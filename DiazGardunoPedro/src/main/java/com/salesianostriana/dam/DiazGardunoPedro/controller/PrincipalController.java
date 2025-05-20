package com.salesianostriana.dam.DiazGardunoPedro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

	@GetMapping("/quienes-somos")
	public String mostrarQuienesSomos() {
	    return "quienes-somos";
	}

	
}
