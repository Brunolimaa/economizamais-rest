package com.economizamais.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.economizamais.domain.Endereco;
import com.economizamais.domain.Preco;
import com.economizamais.repositories.PrecoRepository;

@Service
public class PrecoService {
	
	@Autowired
	private PrecoRepository repo;
	
	public List<Preco> findAll(){
		return repo.findAll();
	}
	
	public List<Preco> findAllApp(){
		return repo.findByListaAppIsTrue();
	}
	
	public Preco findById(Integer id) {
		Optional<Preco> preco = repo.findById(id);
		return preco.orElse(null);
	}
	
	public List<Preco> findByLojaId(Integer id) {
		return repo.findByLojaId(id);
	}
	
	public Preco save(Preco preco) {
		preco.setId(null);
		return repo.save(preco);
	}
	
	public Preco update(Preco preco) {
		return repo.save(preco);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
