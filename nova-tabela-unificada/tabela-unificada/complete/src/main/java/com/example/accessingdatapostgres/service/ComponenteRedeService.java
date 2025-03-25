package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.ComponenteRedeModel;
import com.example.accessingdatapostgres.repository.ComponenteRedeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComponenteRedeService {

    private final ComponenteRedeRepository repository;

    public ComponenteRedeService(ComponenteRedeRepository repository) {
        this.repository = repository;
    }

    public List<ComponenteRedeModel> findAll() {
        return repository.findAll();
    }

    public Optional<ComponenteRedeModel> findById(String id) {
        return repository.findById(id);
    }

    public ComponenteRedeModel save(ComponenteRedeModel componente) {
        return repository.save(componente);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
