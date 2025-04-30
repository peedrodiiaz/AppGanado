package com.salesianostriana.dam.DiazGardunoPedro.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.salesianostriana.dam.DiazGardunoPedro.model.Raza;
import com.salesianostriana.dam.DiazGardunoPedro.model.Vaca;
import com.salesianostriana.dam.DiazGardunoPedro.repository.RazaRepository;
import com.salesianostriana.dam.DiazGardunoPedro.repository.VacaRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RazaService {

	private final VacaRepository vacaRepository;
	
	private final RazaRepository razaRepository;
	
	public List<Raza> getListRaza(){
		
		return razaRepository.findAll();
		
	}  
	
	
	public Raza addRaza (Raza raza) {
		razaRepository.save(raza);
		return raza;
	}
	
	public Raza mostrarFormulario(Model m) {
		Raza r = new Raza();
		m.addAttribute(r);
		return r;
		
	}

// Hacere esto	
//	public Raza deleteRaza(Long id, Long idRazaSinDef) {
//		List <Vaca> vacaList = vacaRepository.findAll();
//		Raza r;
//		Raza sinDef = razaRepository.findById(idRazaSinDef).orElseThrow(()
//				-> new RuntimeException("No existe la raza con id: " + id));
//		for (Vaca v : vacaList) {
//			if (v.getRaza().getId() == id) {
//				v.setRaza(sinDef);
//			}
//		
//		}
//		razaRepository.delete(r);
//		return r;

}
}

