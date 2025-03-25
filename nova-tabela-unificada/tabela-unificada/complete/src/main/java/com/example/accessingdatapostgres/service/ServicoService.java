package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.ServicoModel;
import com.example.accessingdatapostgres.repository.ServicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {

    private final ServicoRepository repository;

    public ServicoService(ServicoRepository repository) {
        this.repository = repository;
    }

    public List<ServicoModel> findAll() {
        return repository.findAll();
    }

    public Optional<ServicoModel> findById(String id) {
        return repository.findById(id);
    }

    public ServicoModel save(ServicoModel servico) {
        return repository.save(servico);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
