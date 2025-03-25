package com.example.accessingdatapostgres.service;

import com.example.accessingdatapostgres.model.TipoLeitoModel;
import com.example.accessingdatapostgres.repository.TipoLeitoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoLeitoService {

    private final TipoLeitoRepository repository;

    public TipoLeitoService(TipoLeitoRepository repository) {
        this.repository = repository;
    }

    public List<TipoLeitoModel> findAll() {
        return repository.findAll();
    }

    public Optional<TipoLeitoModel> findById(String id) {
        return repository.findById(id);
    }

    public TipoLeitoModel save(TipoLeitoModel tipoLeito) {
        return repository.save(tipoLeito);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
