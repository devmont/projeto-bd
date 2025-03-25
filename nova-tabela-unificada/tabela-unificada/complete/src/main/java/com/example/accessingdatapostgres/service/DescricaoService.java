package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.DescricaoModel;
import com.example.accessingdatapostgres.repository.DescricaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DescricaoService {

    private final DescricaoRepository repository;

    public DescricaoService(DescricaoRepository repository) {
        this.repository = repository;
    }

    public List<DescricaoModel> findAll() {
        return repository.findAll();
    }

    public Optional<DescricaoModel> findById(String id) {
        return repository.findById(id);
    }

    public DescricaoModel save(DescricaoModel descricao) {
        return repository.save(descricao);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
