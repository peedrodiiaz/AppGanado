package com.salesianostriana.dam.DiazGardunoPedro.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.salesianostriana.dam.DiazGardunoPedro.model.Vaca;
import com.salesianostriana.dam.DiazGardunoPedro.service.RazaService;
import com.salesianostriana.dam.DiazGardunoPedro.service.VacaService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/vacas")
@RequiredArgsConstructor
public class VacaController {
	 private final VacaService vacaService;
	    private final RazaService razaService;

	    @GetMapping("")
	    public String listarVacas(Model model) {
	        model.addAttribute("TodasVacas", vacaService.findAll());
	        model.addAttribute("TodasRazas", razaService.getListRaza());
	        model.addAttribute("vacaForm", new Vaca());
	        return "vacas/listadoVacas";
	    }

	    @PostMapping("/newVaca")
	    public String crearVaca(@ModelAttribute ("vacaForm") Vaca vaca, RedirectAttributes redirectAttributes) {
	    	Vaca nuevaVaca = vacaService.addVaca(vaca);
		    for (Vaca v : vacaService.findAll()) {
		        if (v.getNumIdentificacion() == nuevaVaca.getNumIdentificacion()) {
		            redirectAttributes.addFlashAttribute("error", "Ya existe esa vaca.");
		            redirectAttributes.addFlashAttribute("showModal", true);
		            return "redirect:/vacas";
		        }
		    }
	        return "redirect:/vacas";
	    	
	    }
}
