package com.uwugang.g1farmacia.repositories;

import com.uwugang.g1farmacia.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCategoria extends JpaRepository<Categoria, Long> {

}
