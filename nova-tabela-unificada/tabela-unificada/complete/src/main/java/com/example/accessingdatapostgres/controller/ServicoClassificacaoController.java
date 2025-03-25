package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.ServicoClassificacaoModel;
import com.example.accessingdatapostgres.service.ServicoClassificacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/servico-classificacao")
public class ServicoClassificacaoController {

    private final ServicoClassificacaoService service;

    public ServicoClassificacaoController(ServicoClassificacaoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ServicoClassificacaoModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServicoClassificacaoModel> getById(@PathVariable String id) {
        Optional<ServicoClassificacaoModel> servicoClassificacao = service.findById(id);
        return servicoClassificacao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ServicoClassificacaoModel> create(@RequestBody ServicoClassificacaoModel servicoClassificacao) {
        return ResponseEntity.ok(service.save(servicoClassificacao));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServicoClassificacaoModel> update(@PathVariable String id, @RequestBody ServicoClassificacaoModel servicoClassificacao) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(servicoClassificacao));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
