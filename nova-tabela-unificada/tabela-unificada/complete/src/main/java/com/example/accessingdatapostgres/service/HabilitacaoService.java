package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.HabilitacaoModel;
import com.example.accessingdatapostgres.repository.HabilitacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HabilitacaoService {

    private final HabilitacaoRepository repository;

    public HabilitacaoService(HabilitacaoRepository repository) {
        this.repository = repository;
    }

    public List<HabilitacaoModel> findAll() {
        return repository.findAll();
    }

    public Optional<HabilitacaoModel> findById(String id) {
        return repository.findById(id);
    }

    public HabilitacaoModel save(HabilitacaoModel habilitacao) {
        return repository.save(habilitacao);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
