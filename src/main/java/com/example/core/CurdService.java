package com.example.core;

import java.io.Serializable;
import java.util.Collection;

public interface CurdService<T extends Serializable> extends BaseService<T>,PopulateBeanPropertiesService<T>{
    public Collection<T> getAll() throws Exception;
    public T getById(long id) throws Exception;
    public T create(T entity) throws Exception;
    public T update(T entity) throws Exception;
    public void delete(long id) throws Exception;

}
