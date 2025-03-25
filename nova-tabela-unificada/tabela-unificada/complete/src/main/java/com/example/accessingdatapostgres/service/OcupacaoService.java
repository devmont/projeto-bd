package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.OcupacaoModel;
import com.example.accessingdatapostgres.repository.OcupacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcupacaoService {

    private final OcupacaoRepository repository;

    public OcupacaoService(OcupacaoRepository repository) {
        this.repository = repository;
    }

    public List<OcupacaoModel> findAll() {
        return repository.findAll();
    }

    public Optional<OcupacaoModel> findById(String id) {
        return repository.findById(id);
    }

    public OcupacaoModel save(OcupacaoModel ocupacao) {
        return repository.save(ocupacao);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
