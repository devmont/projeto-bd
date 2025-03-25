package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.SiaSihModel;
import com.example.accessingdatapostgres.repository.SiaSihRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SiaSihService {

    private final SiaSihRepository repository;

    public SiaSihService(SiaSihRepository repository) {
        this.repository = repository;
    }

    public List<SiaSihModel> findAll() {
        return repository.findAll();
    }

    public Optional<SiaSihModel> findById(String id) {
        return repository.findById(id);
    }

    public SiaSihModel save(SiaSihModel siaSih) {
        return repository.save(siaSih);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
