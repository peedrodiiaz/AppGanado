package com.salesianostriana.dam.DiazGardunoPedro.model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Raza {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String nombre;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToMany (mappedBy = "raza")
	private List<Vaca>listVacas;
	
}
