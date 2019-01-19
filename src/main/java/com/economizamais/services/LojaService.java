package com.economizamais.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.economizamais.domain.Loja;
import com.economizamais.repositories.LojaRepository;

@Service
public class LojaService {
	
	@Autowired
	private LojaRepository repo;
	
	public List<Loja> findAll() {
		return repo.findAll();
	}
	
	public Loja findById(Integer id) {
		Optional<Loja> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public Loja save(Loja entity) {
		entity.setId(null);
		return repo.save(entity);
	}
	
	public Loja update(Loja entity) {
		return repo.save(entity);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
