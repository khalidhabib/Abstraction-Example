package com.khalid.service;

import com.khalid.core.CurdService;
import com.khalid.dao.BaseRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;

@Service
public class CarServiceImp<T extends Serializable> implements CurdService<T> {

private BaseRepository baseDAO;

    @Override
    public Collection<T> getAll() throws Exception {
        return (Collection<T>) baseDAO.findAll();
    }

    @Override
    public T getById(long id) throws Exception {
        return (T) baseDAO.findById(id).get();
    }

    @Override
    public T create(T entity) throws Exception {

        return (T) baseDAO.save(entity);
    }

    @Override
    public T update(T entity) throws Exception {
        return (T) baseDAO.save(entity);
    }

    @Override
    public void delete(long id) throws Exception {
        baseDAO.deleteById(id);
    }

    @Override
    public <ENTITY> ENTITY getEntity(T source) {
        return null;
    }

    @Override
    public <ENTITY> T getDTO(ENTITY entity) {
        return null;
    }
}
