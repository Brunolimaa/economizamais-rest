package com.economizamais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.economizamais.domain.Loja;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Integer>{

}
