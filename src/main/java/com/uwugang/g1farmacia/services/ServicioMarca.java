package com.uwugang.g1farmacia.services;

import com.uwugang.g1farmacia.entity.Marca;
import com.uwugang.g1farmacia.repositories.RepositorioMarca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioMarca implements ServicioBase<Marca>{
    @Autowired
    private RepositorioMarca repositorio;

    @Override
    public List<Marca> findAll() throws Exception {
        try {
            List<Marca> marca = this.repositorio.findAll();
            return marca;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Marca findById(long id) throws Exception {
        try {
            Optional<Marca> opt = this.repositorio.findById(id);
            return opt.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Marca saveOne(Marca entity) throws Exception {
        try {
            Marca marca = this.repositorio.save(entity);
            return marca;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Marca updateOne(Marca entity, long id) throws Exception {
        try {
            Optional<Marca> opt = this.repositorio.findById(id);
            Marca marca = opt.get();
            marca = this.repositorio.save(entity);
            return marca;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public boolean deleteById(long id) throws Exception {
        try {
            Optional<Marca> opt = this.repositorio.findById(id);
            if (!opt.isEmpty()) {
                Marca marca = opt.get();
                this.repositorio.delete(marca);
            } else {
                throw new Exception();
            }
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
