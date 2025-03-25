package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.RenasesModel;
import com.example.accessingdatapostgres.repository.RenasesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RenasesService {

    private final RenasesRepository repository;

    public RenasesService(RenasesRepository repository) {
        this.repository = repository;
    }

    public List<RenasesModel> findAll() {
        return repository.findAll();
    }

    public Optional<RenasesModel> findById(String id) {
        return repository.findById(id);
    }

    public RenasesModel save(RenasesModel renases) {
        return repository.save(renases);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
