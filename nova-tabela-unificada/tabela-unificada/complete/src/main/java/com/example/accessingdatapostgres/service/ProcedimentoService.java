package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.ProcedimentoModel;
import com.example.accessingdatapostgres.repository.ProcedimentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProcedimentoService {

    private final ProcedimentoRepository repository;

    public ProcedimentoService(ProcedimentoRepository repository) {
        this.repository = repository;
    }

    public List<ProcedimentoModel> findAll() {
        return repository.findAll();
    }

    public Optional<ProcedimentoModel> findById(String id) {
        return repository.findById(id);
    }

    public ProcedimentoModel save(ProcedimentoModel procedimento) {
        return repository.save(procedimento);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
