package com.jonathanlucena.cursomc.repositories;

import com.jonathanlucena.cursomc.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository <ItemPedido, Integer> {
}
