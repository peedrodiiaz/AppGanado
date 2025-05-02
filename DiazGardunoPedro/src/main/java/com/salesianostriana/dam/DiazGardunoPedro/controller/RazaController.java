package com.salesianostriana.dam.DiazGardunoPedro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.DiazGardunoPedro.model.Raza;
import com.salesianostriana.dam.DiazGardunoPedro.service.RazaService;

import lombok.RequiredArgsConstructor;



@Controller
@RequestMapping("/razas")
@RequiredArgsConstructor
public class RazaController {


	@Autowired
	private  RazaService razaService;
	
	
	@GetMapping ("")
	public String getRazas (Model model) {

		model.addAttribute("TodasRazas", razaService.getListRaza());
		model.addAttribute("razaForm", new Raza());
		return "razas/listado";
	}
	
	@PostMapping("newRaza")
	public  String addRaza (@ModelAttribute("RazaForm")Raza r) {
		razaService.addRaza(r);
		return "redirect:/razas";
	}
	
	@PostMapping("/deleteRaza/{id}")
		public String deleteRaza(@PathVariable Long id) {
			Long idRazaSinCat = 4L;
			razaService.deleteRaza(id, idRazaSinCat);
			return "redirect:/razas";
		}
	
	
}
