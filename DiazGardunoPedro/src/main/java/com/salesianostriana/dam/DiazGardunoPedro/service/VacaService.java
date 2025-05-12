package com.salesianostriana.dam.DiazGardunoPedro.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.salesianostriana.dam.DiazGardunoPedro.model.Raza;
import com.salesianostriana.dam.DiazGardunoPedro.model.Vaca;
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

		LocalDate hoy = LocalDate.now();

	    
	    if (vaca.getFechaNacimiento() != null && vaca.getFechaNacimiento().isAfter(hoy)) {
	        throw new IllegalArgumentException("La fecha de nacimiento no puede ser posterior a hoy.");
	    }
	    
	    if (vaca.getFechaParto() != null && vaca.getFechaParto().isAfter(hoy)) {
	        throw new IllegalArgumentException("La fecha de parto no puede ser posterior a hoy .");
	    }
	    
	    boolean existe = findAll().stream()
	            .anyMatch(v -> v.getNumIdentificacion() == vaca.getNumIdentificacion());
	    if (existe) {
	        throw new IllegalArgumentException("Ya existe una vaca con ese número de identificación.");
	    }

	    return save(vaca);
		
	}
	
	public Vaca mostrarFormulario(Model m) {
		Vaca v = new Vaca();
		m.addAttribute(v);
		return v;
		
	}
	
	public Vaca putVaca (Vaca v) {
		
		Vaca vaca = findById(v.getId());
		if (vaca != null) {
			vaca.setFechaNacimiento(v.getFechaNacimiento());
			vaca.setFechaParto(v.getFechaParto());
			vaca.setRaza(v.getRaza());
			vaca.setPeso(v.getPeso());
			return edit(vaca);
		}
		return null;
	}
		
	
	public void deleteVaca (Long id) {
		
		 deleteById(id);
		
	}

}
