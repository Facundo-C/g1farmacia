package com.uwugang.g1farmacia.repositories;

import com.uwugang.g1farmacia.entity.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioArticulo extends JpaRepository<Articulo, Long> {

}
