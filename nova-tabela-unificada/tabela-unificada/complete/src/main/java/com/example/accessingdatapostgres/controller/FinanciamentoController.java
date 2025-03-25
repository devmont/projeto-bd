package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.FinanciamentoModel;
import com.example.accessingdatapostgres.service.FinanciamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/financiamentos")
public class FinanciamentoController {

    private final FinanciamentoService service;

    public FinanciamentoController(FinanciamentoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<FinanciamentoModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FinanciamentoModel> getById(@PathVariable String id) {
        Optional<FinanciamentoModel> financiamento = service.findById(id);
        return financiamento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<FinanciamentoModel> create(@RequestBody FinanciamentoModel financiamento) {
        return ResponseEntity.ok(service.save(financiamento));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FinanciamentoModel> update(@PathVariable String id, @RequestBody FinanciamentoModel financiamento) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(financiamento));
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
