package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.RubricaModel;
import com.example.accessingdatapostgres.repository.RubricaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RubricaService {

    private final RubricaRepository repository;

    public RubricaService(RubricaRepository repository) {
        this.repository = repository;
    }

    public List<RubricaModel> findAll() {
        return repository.findAll();
    }

    public Optional<RubricaModel> findById(String id) {
        return repository.findById(id);
    }

    public RubricaModel save(RubricaModel rubrica) {
        return repository.save(rubrica);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
