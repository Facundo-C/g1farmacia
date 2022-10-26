package com.uwugang.g1farmacia.repositories;

import com.uwugang.g1farmacia.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPedido extends JpaRepository<Pedido, Long> {

}
