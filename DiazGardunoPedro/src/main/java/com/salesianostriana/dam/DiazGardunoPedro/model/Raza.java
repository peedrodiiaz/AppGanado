package com.salesianostriana.dam.DiazGardunoPedro.model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Raza {

	@Id
	@GeneratedValue
	private long id;
	private String nombre;
	@OneToMany (mappedBy = "raza")
	private List<Vaca>listVacas;
	
}
