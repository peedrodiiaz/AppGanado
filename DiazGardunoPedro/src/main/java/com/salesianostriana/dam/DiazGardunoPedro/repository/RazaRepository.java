package com.salesianostriana.dam.DiazGardunoPedro.repository;

import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.DiazGardunoPedro.model.Raza;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface RazaRepository extends JpaRepository <Raza,Long> {


	List<Raza> findByNombreContainsIgnoreCase(String nombre);
	
}
