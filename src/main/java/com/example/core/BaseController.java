package com.example.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.util.Collection;

public class BaseController<T extends Serializable> {

    private CurdService<T> service;

    public BaseController(CurdService<T> service) {
        this.service = service;
    }

    @GetMapping(path = "/")
    @ResponseBody
    public ResponseEntity<?> getAll() {
        return listAll();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") long id, HttpServletRequest requst, HttpServletResponse response) throws Throwable {
        return getList(id);
    }

    @PostMapping(path = "/")
    public ResponseEntity<?> create(@RequestBody T body, HttpServletRequest requst, HttpServletResponse response) throws Throwable {
        return save(body);
    }

    @PutMapping(path = "/")
    public ResponseEntity<?> put(@RequestBody T body, HttpServletRequest requst, HttpServletResponse response) throws Throwable {
        return update(body);
    }

    @DeleteMapping(path = "/")
    public ResponseEntity<?> delete(@RequestBody long id, HttpServletRequest requst, HttpServletResponse response) throws Throwable {
        return remove(id);
    }


    private ResponseEntity<?> update(T body) {
        try {
            T updated = service.update(body);
            return ResponseEntity.ok(updated);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getLocalizedMessage());
        }
    }

    private ResponseEntity<?> remove(long id) {
        try {
            service.delete(id);
            return ResponseEntity.ok("Record Deleted Successfully!!");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getLocalizedMessage());
        }
    }


    private ResponseEntity<?> getList(long id) {
        try {
            T entity = service.getById(id);
            return ResponseEntity.ok(entity);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getLocalizedMessage());
        }

    }


    private ResponseEntity<?> listAll() {
        try {
            Collection<T> list = service.getAll();
            return ResponseEntity.ok(list);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getLocalizedMessage());
        }
    }

    private ResponseEntity<?> save(T body) {
        try {
            T savedEntity = service.create(body);
            return ResponseEntity.ok(savedEntity);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getLocalizedMessage());
        }

    }

}
