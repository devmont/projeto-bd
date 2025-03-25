package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.DetalheModel;
import com.example.accessingdatapostgres.service.DetalheService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detalhes")
public class DetalheController {

    private final DetalheService service;

    public DetalheController(DetalheService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DetalheModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalheModel> getById(@PathVariable String id) {
        Optional<DetalheModel> detalhe = service.findById(id);
        return detalhe.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DetalheModel> create(@RequestBody DetalheModel detalhe) {
        return ResponseEntity.ok(service.save(detalhe));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetalheModel> update(@PathVariable String id, @RequestBody DetalheModel detalhe) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(detalhe));
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
