package com.economizamais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.economizamais.domain.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer>{

}