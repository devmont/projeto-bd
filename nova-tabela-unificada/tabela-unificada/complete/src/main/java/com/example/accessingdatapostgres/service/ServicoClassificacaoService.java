package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.ServicoClassificacaoModel;
import com.example.accessingdatapostgres.repository.ServicoClassificacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoClassificacaoService {

    private final ServicoClassificacaoRepository repository;

    public ServicoClassificacaoService(ServicoClassificacaoRepository repository) {
        this.repository = repository;
    }

    public List<ServicoClassificacaoModel> findAll() {
        return repository.findAll();
    }

    public Optional<ServicoClassificacaoModel> findById(String id) {
        return repository.findById(id);
    }

    public ServicoClassificacaoModel save(ServicoClassificacaoModel servicoClassificacao) {
        return repository.save(servicoClassificacao);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
