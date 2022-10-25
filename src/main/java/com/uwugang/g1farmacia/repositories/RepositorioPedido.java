package com.uwugang.g1farmacia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uwugang.g1farmacia.entities.Pedido;

@Repository
public interface RepositorioPedido extends JpaRepository<Pedido, Long>{

}
