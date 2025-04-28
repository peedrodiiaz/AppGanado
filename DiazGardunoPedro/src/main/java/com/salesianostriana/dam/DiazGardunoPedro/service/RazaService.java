package com.salesianostriana.dam.DiazGardunoPedro.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.DiazGardunoPedro.model.Raza;
import com.salesianostriana.dam.DiazGardunoPedro.repository.RazaRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RazaService {

	private final RazaRepository razaRepository ;
	
	public List<Raza> getListRaza(){
		
		return razaRepository.findAll();
		
	}  
	
	
	public Raza addRaza (Raza raza) {
		razaRepository.save(raza);
		return raza;
	}
 	

}

