package com.jonathanlucena.cursomc.repositories;

import com.jonathanlucena.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Integer> {
}
