package com.uwugang.g1farmacia.services;

import com.uwugang.g1farmacia.entity.Articulo;
import com.uwugang.g1farmacia.repositories.RepositorioArticulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ServicioArticulo implements ServicioBase<Articulo> {
    @Autowired
    private RepositorioArticulo repositorio;

    @Override
    @Transactional
    public List<Articulo> findAll() throws Exception {
        try {
            List<Articulo> articulos = this.repositorio.findAll();
            return articulos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Articulo findById(long id) throws Exception {
        try {
            Optional<Articulo> opt = this.repositorio.findById(id);
            return opt.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Articulo saveOne(Articulo entity) throws Exception {
        try {
            Articulo articulo = this.repositorio.save(entity);
            return articulo;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Articulo updateOne(Articulo entity, long id) throws Exception {
        try {
            Optional<Articulo> opt = this.repositorio.findById(id);
            Articulo articulo = opt.get();
            articulo = this.repositorio.save(entity);
            return articulo;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(long id) throws Exception {
        try {
            Optional<Articulo> opt = this.repositorio.findById(id);
            if (!opt.isEmpty()) {
                Articulo articulo = opt.get();
                this.repositorio.delete(articulo);
            } else {
                throw new Exception();
            }
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
