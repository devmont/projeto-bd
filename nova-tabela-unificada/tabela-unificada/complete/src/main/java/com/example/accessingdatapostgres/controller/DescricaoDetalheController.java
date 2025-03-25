package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.DescricaoDetalheModel;
import com.example.accessingdatapostgres.service.DescricaoDetalheService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/descricao-detalhes")
public class DescricaoDetalheController {

    private final DescricaoDetalheService service;

    public DescricaoDetalheController(DescricaoDetalheService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DescricaoDetalheModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DescricaoDetalheModel> getById(@PathVariable String id) {
        Optional<DescricaoDetalheModel> detalhe = service.findById(id);
        return detalhe.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DescricaoDetalheModel> create(@RequestBody DescricaoDetalheModel detalhe) {
        return ResponseEntity.ok(service.save(detalhe));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DescricaoDetalheModel> update(@PathVariable String id, @RequestBody DescricaoDetalheModel detalhe) {
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
