package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.RedeAtencaoModel;
import com.example.accessingdatapostgres.repository.RedeAtencaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RedeAtencaoService {

    private final RedeAtencaoRepository repository;

    public RedeAtencaoService(RedeAtencaoRepository repository) {
        this.repository = repository;
    }

    public List<RedeAtencaoModel> findAll() {
        return repository.findAll();
    }

    public Optional<RedeAtencaoModel> findById(String id) {
        return repository.findById(id);
    }

    public RedeAtencaoModel save(RedeAtencaoModel redeAtencao) {
        return repository.save(redeAtencao);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
