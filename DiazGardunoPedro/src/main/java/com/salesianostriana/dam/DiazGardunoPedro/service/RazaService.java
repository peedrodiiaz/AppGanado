package com.salesianostriana.dam.DiazGardunoPedro.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.salesianostriana.dam.DiazGardunoPedro.model.Raza;
import com.salesianostriana.dam.DiazGardunoPedro.model.Vaca;
import com.salesianostriana.dam.DiazGardunoPedro.repository.RazaRepository;
import com.salesianostriana.dam.DiazGardunoPedro.repository.VacaRepository;
import com.salesianostriana.dam.DiazGardunoPedro.serviceBase.BaseService;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class RazaService extends BaseService<Raza, Long, RazaRepository> {

	private final VacaRepository vacaRepository;
	
	
	public List<Raza> getListRaza(){
		
		return findAll();
		
	}  
	
	
	public Raza addRaza (Raza raza) {
		return save(raza);
	}
	
	public Raza mostrarFormulario(Model m) {
		Raza r = new Raza();
		m.addAttribute(r);
		return r;
		
	}
	


	public void deleteRaza(Long id, Long idRazaSinCat) {
		Raza razaEliminar = repositorio.findById(id).orElseThrow(()
				-> new RuntimeException("No se ha encontrado la raza"));
		
		Raza razaSinCat = repositorio.findById(idRazaSinCat).orElseThrow(()
				-> new RuntimeException("No se ha encontrado la raza"));
		
		List<Vaca> vacas = vacaRepository.findByRaza(razaEliminar);
		
		for (Vaca v : vacas) {
			v.setRaza(razaSinCat);
			
		}
		vacaRepository.saveAll(vacas);
		delete(razaEliminar);

	}
}

