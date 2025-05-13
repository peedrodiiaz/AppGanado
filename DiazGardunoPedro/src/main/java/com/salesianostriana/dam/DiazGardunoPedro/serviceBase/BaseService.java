package com.salesianostriana.dam.DiazGardunoPedro.serviceBase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public abstract class BaseService <T, ID, R extends JpaRepository<T, ID>> {

	@Autowired
	protected R repositorio;


	public T save(T t) {
		return repositorio.save(t);
	}

	public T findById(ID id) {

		return repositorio.findById(id).orElse(null);
	}
	public List<T> findAll() {
		return repositorio.findAll();
	}
	public T edit(T t) {
		return repositorio.save(t);
	}
	public List<T> saveAll(List<T> t) {
		return repositorio.saveAll(t);
	}
	public void delete(T t) {
		repositorio.delete(t);
	}
	public void deleteById(ID id) {
		repositorio.deleteById(id);
	}
	
}
