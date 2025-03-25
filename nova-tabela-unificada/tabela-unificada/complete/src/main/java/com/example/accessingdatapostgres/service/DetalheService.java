package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.DetalheModel;
import com.example.accessingdatapostgres.repository.DetalheRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalheService {

    private final DetalheRepository repository;

    public DetalheService(DetalheRepository repository) {
        this.repository = repository;
    }

    public List<DetalheModel> findAll() {
        return repository.findAll();
    }

    public Optional<DetalheModel> findById(String id) {
        return repository.findById(id);
    }

    public DetalheModel save(DetalheModel detalhe) {
        return repository.save(detalhe);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
