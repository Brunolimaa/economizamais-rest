package com.economizamais.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.economizamais.domain.Produto;
import com.economizamais.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;
	
	public List<Produto> findAll(){
		return repo.findLojas();
	}
	
	public Produto findById(Integer id) {
		Optional<Produto> produto = repo.findById(id);
		return produto.orElse(null);
	}
	
	public Produto save(Produto produto) {
		produto.setId(null);
		return repo.save(produto);
	}
	
	public Produto update(Produto produto) {
		return repo.save(produto);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
