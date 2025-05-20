package com.salesianostriana.dam.DiazGardunoPedro.service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.salesianostriana.dam.DiazGardunoPedro.model.Vaca;
import com.salesianostriana.dam.DiazGardunoPedro.repository.VacaRepository;
import com.salesianostriana.dam.DiazGardunoPedro.serviceBase.BaseServiceImpl;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class VacaService extends BaseServiceImpl<Vaca, Long, VacaRepository> {
	
	
	public List<Vaca> getListVaca(){
		
		return findAll();
		
	}  
	
	
	public Vaca addVaca (Vaca vaca) {

		LocalDate hoy = LocalDate.now();
		boolean  existe;
	    
	    if (vaca.getFechaNacimiento() != null && vaca.getFechaNacimiento().isAfter(hoy)) {
	        throw new IllegalArgumentException("La fecha de nacimiento no puede ser posterior a hoy.");
	    }
	    
	    if ( vaca.getFechaParto() != null && vaca.getFechaParto().isAfter(vaca.getFechaNacimiento()) ) {
	        throw new IllegalArgumentException("La fecha de parto no puede ser posterior a la fecha de nacimiento .");
	    }
	    
	    existe = findAll().stream()
	            .anyMatch(v -> v.getNumIdentificacion() == vaca.getNumIdentificacion());
	    if (existe) {
	        throw new IllegalArgumentException("Ya existe una vaca con ese número de identificación.");
	    }
	    if (vaca.isVendida() && vaca.getPrecioVenta() <= 0) {
	        throw new IllegalArgumentException("Has marcado la vaca como vendida, pero no has puesto un precio de venta.");
	    }
	    if (!vaca.isVendida() && vaca.getPrecioVenta() > 0) {
	        throw new IllegalArgumentException("Has puesto un precio de venta, pero no has marcado la vaca como vendida.");
	    }
			
		

	    if (!vaca.isVendida()) {
	        vaca.setPrecioVenta(0); 
	    }

	    return save(vaca);
	  	
	}
	
	public Vaca mostrarFormulario(Model m) {
		Vaca v = new Vaca();
		m.addAttribute(v);
		return v;
		
	}
	
	public Optional<Vaca> putVaca(Vaca v) {

		
		if ( v.getFechaParto() != null && v.getFechaParto().isAfter(v.getFechaNacimiento()) ) {
		        throw new IllegalArgumentException("La fecha de parto no puede ser posterior a la fecha de nacimiento .");
		    }
	    if (v.isVendida()) {
	        if (v.getPrecioVenta() <= 0) {
	            return Optional.empty(); 
	        }
	    } else {
	        v.setPrecioVenta(0); 
	    }

	    return Optional.of(edit(v));
	}

		
	
	public void deleteVaca (Long id) {
		
		 deleteById(id);
		
	}
	
	public List<Vaca> findByNumIdentificacion(int numIdentificacion) {
		
		return repositorio.findByNumIdentificacion(numIdentificacion);
	}
	
	
	
	public List<Vaca> obtenerVacasOrdenadas(String criterio) {
	    List<Vaca> vacas = findAll();

	    Comparator<Vaca> comparator = switch (criterio) {	
	        case "pesoDesc" -> Comparator.comparingDouble(Vaca::getPeso).reversed();
	        case "pesoAsc" -> Comparator.comparingDouble(Vaca::getPeso);
	        case "edadDesc" -> Comparator.comparing(Vaca::getFechaNacimiento);
	        case "edadAsc" -> Comparator.comparing(Vaca::getFechaNacimiento).reversed();
	        case "partoReciente" -> Comparator.comparing(Vaca::getFechaParto, Comparator.nullsLast(LocalDate::compareTo)).reversed();
	        case "partoAntiguo" -> Comparator.comparing(Vaca::getFechaParto,Comparator.nullsLast(LocalDate::compareTo));
	        case "precioVentaDesc" -> Comparator.comparingDouble(Vaca::getPrecioVenta).reversed();
	        case "precioVentaAsc" -> Comparator.comparingDouble(Vaca::getPrecioVenta);
	        default -> throw new IllegalArgumentException("Criterio de orden no válido: " + criterio);
	    };

	    vacas.sort(comparator);
	    return vacas;
	}
	
	
	

}
