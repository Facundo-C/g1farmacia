package com.uwugang.g1farmacia.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uwugang.g1farmacia.entities.Categoria;
import com.uwugang.g1farmacia.repositories.RepositorioCategoria;

@Service
public class ServicioCategoria implements ServicioBase<Categoria> {
	@Autowired
	private RepositorioCategoria repositorio;
	
	@Override
	@Transactional
	public List<Categoria> findAll() throws Exception {
		try {
            List<Categoria> categoria = this.repositorio.findAll();
            return categoria;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
	}

	@Override
	@Transactional
	public Categoria findById(long id) throws Exception {
		try {
            Optional<Categoria> opt = this.repositorio.findById(id);
            return opt.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
	}

	@Override
	@Transactional
	public Categoria saveOne(Categoria entity) throws Exception {
		try {
			Categoria categoria = this.repositorio.save(entity);
            return categoria;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
	}

	@Override
	@Transactional
	public Categoria updateOne(Categoria entity, long id) throws Exception {
		try {
            Optional<Categoria> opt = this.repositorio.findById(id);
            Categoria categoria = opt.get();
            categoria = this.repositorio.save(entity);
            return categoria;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
	}

	@Override
	@Transactional
	public boolean deleteById(long id) throws Exception {
		try {
			Optional<Categoria> opt = this.repositorio.findById(id);
			if (!opt.isEmpty()) {
				Categoria categoria = opt.get();
				this.repositorio.delete(categoria);
			} else {
				throw new Exception();
			}
			return true;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
