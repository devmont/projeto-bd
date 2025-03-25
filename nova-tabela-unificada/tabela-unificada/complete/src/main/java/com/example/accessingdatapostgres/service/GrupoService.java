package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.GrupoModel;
import com.example.accessingdatapostgres.repository.GrupoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoService {

    private final GrupoRepository repository;

    public GrupoService(GrupoRepository repository) {
        this.repository = repository;
    }

    public List<GrupoModel> findAll() {
        return repository.findAll();
    }

    public Optional<GrupoModel> findById(String id) {
        return repository.findById(id);
    }

    public GrupoModel save(GrupoModel grupo) {
        return repository.save(grupo);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
