package com.salesianostriana.dam.DiazGardunoPedro.repository;

import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.DiazGardunoPedro.model.Raza;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface RazaRepository extends JpaRepository <Raza,Long> {

}
