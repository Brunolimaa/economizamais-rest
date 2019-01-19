package com.economizamais.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.economizamais.domain.Marca;
import com.economizamais.repositories.MarcaRepository;

@Service
public class MarcaService {
	
	@Autowired
	private MarcaRepository repo;
	
	public List<Marca> findAll(){
		return repo.findAll();
	}
	
	public Marca findById(Integer id) {
		Optional<Marca> marca = repo.findById(id);
		return marca.orElse(null);
	}
	
	public Marca save(Marca marca) {
		marca.setId(null);
		return repo.save(marca);
	}
	
	public Marca update(Marca marca) {
		return repo.save(marca);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
