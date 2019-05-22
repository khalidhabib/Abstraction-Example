package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BaseRepository<E> extends CrudRepository<E,Long> {

}
