package com.salesianostriana.dam.DiazGardunoPedro.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String addRaza(@ModelAttribute("razaForm") Raza r, RedirectAttributes redirectAttributes) {
	    Raza nuevaRaza = razaService.addRaza(r);
	    if (nuevaRaza == null) {
	        redirectAttributes.addFlashAttribute("error", "Ya existe una raza con ese nombre.");
	        redirectAttributes.addFlashAttribute("showModal", true);
	        return "redirect:/razas";
	    }
	    return "redirect:/razas";
	}
	
	@PostMapping("/editRaza/{id}")
	public String editRaza(@PathVariable Long id, @ModelAttribute("razaForm") Raza r) {
		Optional<Raza> raza = razaService.putRaza(r);
		if (raza.isPresent()) {
			return "redirect:/razas";
		}
		return "redirect:/razas";
	}
	
	

	@PostMapping("/deleteRaza/{id}")
		public String deleteRaza(@PathVariable Long id) {
			Long idRazaSinCat = 4L;
			razaService.deleteRaza(id, idRazaSinCat);
			return "redirect:/razas";
		}

	@GetMapping("/{id}")
	public String verVacasPorRaza(@PathVariable Long id, Model model) {
	    Optional<Raza> raza = razaService.findById(id);
	    
	    if (raza.isPresent()) {
	        model.addAttribute("raza", raza.get());
	    } else {
	        model.addAttribute("error", "Raza no encontrada");
			
		}
	    
	    return "razas/listadoPorRazas"; 
	}
	
	
	
}
