package com.uwugang.g1farmacia.repositories;

import com.uwugang.g1farmacia.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioMarca extends JpaRepository<Marca, Long> {

}
