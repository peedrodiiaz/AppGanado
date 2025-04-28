package com.salesianostriana.dam.DiazGardunoPedro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.DiazGardunoPedro.service.RazaService;

import lombok.RequiredArgsConstructor;



@Controller
@RequestMapping("/razas")
@RequiredArgsConstructor
public class RazaController {


	@Autowired
	private RazaService razaService;
	
	
	@GetMapping ("")
	public String getRazas (Model model) {

		model.addAttribute("TodasRazas", razaService.getListRaza());
		return "razas/listado";
	}
}
