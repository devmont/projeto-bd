package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.ModalidadeModel;
import com.example.accessingdatapostgres.repository.ModalidadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModalidadeService {

    private final ModalidadeRepository repository;

    public ModalidadeService(ModalidadeRepository repository) {
        this.repository = repository;
    }

    public List<ModalidadeModel> findAll() {
        return repository.findAll();
    }

    public Optional<ModalidadeModel> findById(String id) {
        return repository.findById(id);
    }

    public ModalidadeModel save(ModalidadeModel modalidade) {
        return repository.save(modalidade);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
