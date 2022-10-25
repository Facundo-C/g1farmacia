package com.uwugang.g1farmacia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uwugang.g1farmacia.entities.Categoria;

@Repository
public interface RepositorioCategoria extends JpaRepository<Categoria, Long> {

}
