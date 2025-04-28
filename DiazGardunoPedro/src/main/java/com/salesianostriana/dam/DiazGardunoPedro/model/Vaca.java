package com.salesianostriana.dam.DiazGardunoPedro.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vaca {


	@Id
	@GeneratedValue
	private long id;
	private double peso;
	private int numIdentificacion;
	
	private LocalDateTime fechaNacimineto;
	private LocalDateTime fechaParto;
	
	@ManyToOne
	private Raza raza;
	
	
	
}
