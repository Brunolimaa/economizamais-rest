package com.economizamais.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.economizamais.domain.Preco;

@Repository
public interface PrecoRepository extends JpaRepository<Preco, Integer>{
	List<Preco> findByListaAppIsTrue();
	
	List<Preco> findByLojaId(Integer id);
}
