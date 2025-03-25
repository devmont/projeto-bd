package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.RegistroModel;
import com.example.accessingdatapostgres.repository.RegistroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroService {

    private final RegistroRepository repository;

    public RegistroService(RegistroRepository repository) {
        this.repository = repository;
    }

    public List<RegistroModel> findAll() {
        return repository.findAll();
    }

    public Optional<RegistroModel> findById(String id) {
        return repository.findById(id);
    }

    public RegistroModel save(RegistroModel registro) {
        return repository.save(registro);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
