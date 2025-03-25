package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.DescricaoDetalheModel;
import com.example.accessingdatapostgres.repository.DescricaoDetalheRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DescricaoDetalheService {

    private final DescricaoDetalheRepository repository;

    public DescricaoDetalheService(DescricaoDetalheRepository repository) {
        this.repository = repository;
    }

    public List<DescricaoDetalheModel> findAll() {
        return repository.findAll();
    }

    public Optional<DescricaoDetalheModel> findById(String id) {
        return repository.findById(id);
    }

    public DescricaoDetalheModel save(DescricaoDetalheModel detalhe) {
        return repository.save(detalhe);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
