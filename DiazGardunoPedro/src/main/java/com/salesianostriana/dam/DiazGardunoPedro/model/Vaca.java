package com.salesianostriana.dam.DiazGardunoPedro.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private double peso;
	private int numIdentificacion;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacimiento ;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaParto;
	
	private boolean vendida;
	private double precioVenta;
	@ManyToOne
	private Raza raza;
	
	
	
}
