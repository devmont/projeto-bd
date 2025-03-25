package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.FinanciamentoModel;
import com.example.accessingdatapostgres.repository.FinanciamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinanciamentoService {

    private final FinanciamentoRepository repository;

    public FinanciamentoService(FinanciamentoRepository repository) {
        this.repository = repository;
    }

    public List<FinanciamentoModel> findAll() {
        return repository.findAll();
    }

    public Optional<FinanciamentoModel> findById(String id) {
        return repository.findById(id);
    }

    public FinanciamentoModel save(FinanciamentoModel financiamento) {
        return repository.save(financiamento);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
