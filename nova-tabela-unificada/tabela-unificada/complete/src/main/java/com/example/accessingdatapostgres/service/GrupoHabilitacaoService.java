package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.GrupoHabilitacaoModel;
import com.example.accessingdatapostgres.repository.GrupoHabilitacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoHabilitacaoService {

    private final GrupoHabilitacaoRepository repository;

    public GrupoHabilitacaoService(GrupoHabilitacaoRepository repository) {
        this.repository = repository;
    }

    public List<GrupoHabilitacaoModel> findAll() {
        return repository.findAll();
    }

    public Optional<GrupoHabilitacaoModel> findById(String id) {
        return repository.findById(id);
    }

    public GrupoHabilitacaoModel save(GrupoHabilitacaoModel grupoHabilitacao) {
        return repository.save(grupoHabilitacao);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
