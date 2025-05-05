package com.salesianostriana.dam.DiazGardunoPedro.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.salesianostriana.dam.DiazGardunoPedro.model.Vaca;
import com.salesianostriana.dam.DiazGardunoPedro.repository.RazaRepository;
import com.salesianostriana.dam.DiazGardunoPedro.repository.VacaRepository;
import com.salesianostriana.dam.DiazGardunoPedro.serviceBase.BaseService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class VacaService extends BaseService<Vaca, Long, VacaRepository> {
	
	
	public List<Vaca> getListVaca(){
		
		return findAll();
		
	}  
	
	
	public Vaca addVaca (Vaca vaca) {

		return save(vaca);
	}
	
	public Vaca mostrarFormulario(Model m) {
		Vaca v = new Vaca();
		m.addAttribute(v);
		return v;
		
	}
	
	public Vaca putVaca (Vaca v) {
		
			return edit(v);
		
	}
	public void deleteVaca (Long id) {
		
		 deleteById(id);
		
	}

}
