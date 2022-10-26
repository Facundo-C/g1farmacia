package com.uwugang.g1farmacia.repositories;

import com.uwugang.g1farmacia.entity.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCarrito extends JpaRepository<Carrito, Long> {

}
