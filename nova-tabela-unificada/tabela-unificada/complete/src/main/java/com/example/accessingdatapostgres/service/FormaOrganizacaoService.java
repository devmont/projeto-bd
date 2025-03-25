package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.FormaOrganizacaoModel;
import com.example.accessingdatapostgres.repository.FormaOrganizacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormaOrganizacaoService {

    private final FormaOrganizacaoRepository repository;

    public FormaOrganizacaoService(FormaOrganizacaoRepository repository) {
        this.repository = repository;
    }

    public List<FormaOrganizacaoModel> findAll() {
        return repository.findAll();
    }

    public Optional<FormaOrganizacaoModel> findById(String id) {
        return repository.findById(id);
    }

    public FormaOrganizacaoModel save(FormaOrganizacaoModel formaOrganizacao) {
        return repository.save(formaOrganizacao);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
