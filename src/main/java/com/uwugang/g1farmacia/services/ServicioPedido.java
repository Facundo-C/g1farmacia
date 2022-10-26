package com.uwugang.g1farmacia.services;

import com.uwugang.g1farmacia.entity.Pedido;
import com.uwugang.g1farmacia.repositories.RepositorioPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ServicioPedido implements ServicioBase<Pedido>{
    @Autowired
    private RepositorioPedido repositorio;

    @Override
    @Transactional
    public List<Pedido> findAll() throws Exception {
        try {
            List<Pedido> pedido = this.repositorio.findAll();
            return pedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Pedido findById(long id) throws Exception {
        try {
            Optional<Pedido> opt = this.repositorio.findById(id);
            return opt.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Pedido saveOne(Pedido entity) throws Exception {
        try {
            Pedido pedido = this.repositorio.save(entity);
            return pedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Pedido updateOne(Pedido entity, long id) throws Exception {
        try {
            Optional<Pedido> opt = this.repositorio.findById(id);
            Pedido pedido = opt.get();
            pedido = this.repositorio.save(entity);
            return pedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(long id) throws Exception {
        try {
            Optional<Pedido> opt = this.repositorio.findById(id);
            if (!opt.isEmpty()) {
                Pedido pedido = opt.get();
                this.repositorio.delete(pedido);
            } else {
                throw new Exception();
            }
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
