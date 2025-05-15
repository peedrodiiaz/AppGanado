package com.salesianostriana.dam.DiazGardunoPedro.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.salesianostriana.dam.DiazGardunoPedro.model.Raza;
import com.salesianostriana.dam.DiazGardunoPedro.model.Vaca;
import com.salesianostriana.dam.DiazGardunoPedro.repository.RazaRepository;
import com.salesianostriana.dam.DiazGardunoPedro.repository.VacaRepository;
import com.salesianostriana.dam.DiazGardunoPedro.serviceBase.BaseServiceImpl;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class RazaService extends BaseServiceImpl<Raza, Long, RazaRepository> {

	private final VacaRepository vacaRepository;
	
	
	public List<Raza> getListRaza(){
		
		return findAll();
		
	}  
	
	public Optional<Raza> findPorId(Long id) {
	    return findById(id);
	}

	
	public Raza addRaza (Raza raza) {
		List<Raza> razas = findAll();
		String nombreRaza = raza.getNombre().trim();
		for (Raza r : razas) {
			if (r.getNombre().equalsIgnoreCase(nombreRaza)) {
				return null;
				
			}
		}
		return save(raza);
	}
	
	public Raza mostrarFormulario(Model m) {
		Raza r = new Raza();
		m.addAttribute(r);
		return r;
		
	}
	
	
	public Optional<Raza> putRaza (Raza r) {
		
		return Optional.of(edit(r));
	
	
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
	
	
	public List<Raza> findByNombreContainsIgnoreCase(String nombre) {
		return repositorio.findByNombreContainsIgnoreCase(nombre);
	}
	
	
	
}

