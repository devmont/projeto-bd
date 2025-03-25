package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.RegraCondicionadaModel;
import com.example.accessingdatapostgres.repository.RegraCondicionadaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegraCondicionadaService {

    private final RegraCondicionadaRepository repository;

    public RegraCondicionadaService(RegraCondicionadaRepository repository) {
        this.repository = repository;
    }

    public List<RegraCondicionadaModel> findAll() {
        return repository.findAll();
    }

    public Optional<RegraCondicionadaModel> findById(String id) {
        return repository.findById(id);
    }

    public RegraCondicionadaModel save(RegraCondicionadaModel regra) {
        return repository.save(regra);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
