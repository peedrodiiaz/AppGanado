package com.salesianostriana.dam.DiazGardunoPedro.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.salesianostriana.dam.DiazGardunoPedro.model.Raza;
import com.salesianostriana.dam.DiazGardunoPedro.model.Vaca;
import com.salesianostriana.dam.DiazGardunoPedro.service.RazaService;
import com.salesianostriana.dam.DiazGardunoPedro.service.VacaService;

@Controller
@RequestMapping("/vacas")
public class VacaController {
		@Autowired
		private  VacaService vacaService;
		@Autowired
		private  RazaService razaService;

		@GetMapping("")
		public String listarVacas(Model model) {
			model.addAttribute("TodasVacas", vacaService.findAll());
			model.addAttribute("TodasRazas", razaService.getListRaza());
			model.addAttribute("vacaEditarRazaId", 0);
			model.addAttribute("vaca", new Vaca());
			return "vacas/listadoVacas";
		}

		@PostMapping("/newVaca")
		public String crearVaca(@ModelAttribute("vaca") Vaca vaca, RedirectAttributes redirectAttributes) {
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
		public String editarVaca(@PathVariable Long id, @ModelAttribute("vaca") Vaca r, @ModelAttribute("vacaEditarRazaId") long razaId, RedirectAttributes redirectAttributes) {
			try {
				r.setRaza(razaService.findPorId(razaId).get());
			Optional<Vaca> vaca = vacaService.putVaca(r);
				if (vaca.isPresent()) {
					return "redirect:/vacas";
				}else {
					return "redirect:/vacas?error=Has marcado vendida, pero no has puesto el precio de venta";
				}
			} catch (IllegalArgumentException e) {
				redirectAttributes.addFlashAttribute("error", e.getMessage());
				redirectAttributes.addFlashAttribute("showModal", true); 
				return "redirect:/vacas";
			}
			
			
		}
		
		@GetMapping("/editarVaca/{id}")
		public String editarVaca(@PathVariable Long id, Model model) {
			Optional<Vaca> vaca = vacaService.findById(id);
			if (vaca.isPresent()) {
				model.addAttribute("vaca", vaca.get());
				model.addAttribute("TodasRazas", razaService.getListRaza());
				return "vacas/editarVaca";
			} else {
				return "redirect:/vacas"; 
				
			}
		
		}
		
	

		@PostMapping("/deleteVaca/{id}")
		public String eliminarVaca(@PathVariable Long id) {
			vacaService.deleteVaca(id);
			return "redirect:/vacas";
		}
		
		@GetMapping("/ordenadas")
		public String listarVacasOrdenadas(@RequestParam("criterio") String criterio, Model model) {
			List<Vaca> vacasOrdenadas = vacaService.obtenerVacasOrdenadas(criterio);
			model.addAttribute("TodasVacas", vacasOrdenadas);
			model.addAttribute("TodasRazas", razaService.getListRaza()); 
			model.addAttribute("vaca", new Vaca()); 
			return "vacas/listadoVacas"; 
		}
		
		@GetMapping("/buscar")
		public String buscarVacas(@RequestParam("numIdentificacion") int numIdentificacion, Model model) {
			
			List<Vaca> resultados = vacaService.findByNumIdentificacion(numIdentificacion);
			
			model.addAttribute("TodasVacas", resultados);
			model.addAttribute("TodasRazas", razaService.getListRaza());
			model.addAttribute("vaca", new Vaca());
			return "vacas/listadoVacas"; 
		} 
		
		 @GetMapping("/estadisticas")
		    public String mostrarEstadisticas(Model model) {
		        double totalVentas = vacaService.calcularTotalVentas();
		        double mediaVentas = vacaService.calcularMediaVentas();

		        List<Raza> razas = razaService.findAll(); 
		        Map<String, Double> mediaPorRaza = new HashMap<>();

		        for (Raza raza : razas) {
		            double media = vacaService.calcularMediaVentasPorRaza(raza.getId());
		            mediaPorRaza.put(raza.getNombre(), media);
		        }

		        model.addAttribute("totalVentas", totalVentas);
		        model.addAttribute("mediaVentas", mediaVentas);
		        model.addAttribute("mediaPorRaza", mediaPorRaza);

		        return "vacas/estadisticas"; 
		    }

		



}
