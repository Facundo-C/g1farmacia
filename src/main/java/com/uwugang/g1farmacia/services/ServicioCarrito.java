package com.uwugang.g1farmacia.services;

import com.uwugang.g1farmacia.entity.Carrito;
import com.uwugang.g1farmacia.repositories.RepositorioCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ServicioCarrito implements ServicioBase<Carrito>{
    @Autowired
    private RepositorioCarrito repositorio;

    @Override
    @Transactional
    public List<Carrito> findAll() throws Exception {
        try {
            List<Carrito> carritos = this.repositorio.findAll();
            return carritos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Carrito findById(long id) throws Exception {
        try {
            Optional<Carrito> opt = this.repositorio.findById(id);
            return opt.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Carrito saveOne(Carrito entity) throws Exception {
        try {
            Carrito carrito = this.repositorio.save(entity);
            return carrito;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Carrito updateOne(Carrito entity, long id) throws Exception {
        try {
            Optional<Carrito> opt = this.repositorio.findById(id);
            Carrito carrito = opt.get();
            carrito = this.repositorio.save(entity);
            return carrito;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(long id) throws Exception {
        try {
            Optional<Carrito> opt = this.repositorio.findById(id);
            if (!opt.isEmpty()) {
                Carrito carrito = opt.get();
                this.repositorio.delete(carrito);
            } else {
                throw new Exception();
            }
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
