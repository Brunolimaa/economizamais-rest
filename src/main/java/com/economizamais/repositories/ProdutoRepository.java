package com.economizamais.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.economizamais.domain.Loja;
import com.economizamais.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
	@Query(value = "SELECT * FROM produto prod INNER JOIN loja l ON prod.id = l.id", nativeQuery = true)
	List<Produto> findLojas();
}
                                                               