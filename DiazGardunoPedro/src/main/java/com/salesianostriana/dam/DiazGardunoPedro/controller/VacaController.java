package com.salesianostriana.dam.DiazGardunoPedro.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.salesianostriana.dam.DiazGardunoPedro.model.Raza;
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
	        model.addAttribute("vaca", new Vaca());
	        return "vacas/listadoVacas";
	    }

	    @PostMapping("/newVaca")
	    public String crearVaca(@ModelAttribute("vacaForm") Vaca vaca, RedirectAttributes redirectAttributes) {
	        try {
	            Vaca nuevaVaca = vacaService.addVaca(vaca);

	            if (nuevaVaca == null) {
	                redirectAttributes.addFlashAttribute("error", "Ya existe una vaca con ese número de identificación.");
	                redirectAttributes.addFlashAttribute("showModal", true); 
	                return "redirect:/vacas";
	            }

	        } catch (IllegalArgumentException e) {
	            redirectAttributes.addFlashAttribute("error", e.getMessage());
	            redirectAttributes.addFlashAttribute("showModal", true); 
	            return "redirect:/vacas";
	        }

	        return "redirect:/vacas";
	    }
	    
	    
	    @PostMapping("/editarVaca/{id}")
	   public String editarVaca(@PathVariable Long id, @ModelAttribute("TodasVacas") Vaca r) {
	
	  	  Vaca vaca = vacaService.putVaca(r);
	        if (vaca == null) {
	            return "redirect:/vacas";
	        }
	        return "redirect:/vacas";
	    }

}
