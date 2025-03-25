package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.TussModel;
import com.example.accessingdatapostgres.repository.TussRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TussService {

    private final TussRepository repository;

    public TussService(TussRepository repository) {
        this.repository = repository;
    }

    public List<TussModel> findAll() {
        return repository.findAll();
    }

    public Optional<TussModel> findById(String id) {
        return repository.findById(id);
    }

    public TussModel save(TussModel tuss) {
        return repository.save(tuss);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
