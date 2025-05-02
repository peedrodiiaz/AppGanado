package com.salesianostriana.dam.DiazGardunoPedro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.DiazGardunoPedro.model.Raza;
import com.salesianostriana.dam.DiazGardunoPedro.model.Vaca;

import lombok.RequiredArgsConstructor;


@Repository
public interface VacaRepository extends JpaRepository<Vaca, Long> {
	List<Vaca> findByRaza(Raza raza);
}
