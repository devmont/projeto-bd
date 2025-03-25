package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.SubGrupoModel;
import com.example.accessingdatapostgres.repository.SubGrupoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubGrupoService {

    private final SubGrupoRepository repository;

    public SubGrupoService(SubGrupoRepository repository) {
        this.repository = repository;
    }

    public List<SubGrupoModel> findAll() {
        return repository.findAll();
    }

    public Optional<SubGrupoModel> findById(String id) {
        return repository.findById(id);
    }

    public SubGrupoModel save(SubGrupoModel subGrupo) {
        return repository.save(subGrupo);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
