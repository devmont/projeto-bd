package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.DescricaoModel;
import com.example.accessingdatapostgres.service.DescricaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/descricoes")
public class DescricaoController {

    private final DescricaoService service;

    public DescricaoController(DescricaoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DescricaoModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DescricaoModel> getById(@PathVariable String id) {
        Optional<DescricaoModel> descricao = service.findById(id);
        return descricao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DescricaoModel> create(@RequestBody DescricaoModel descricao) {
        return ResponseEntity.ok(service.save(descricao));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DescricaoModel> update(@PathVariable String id, @RequestBody DescricaoModel descricao) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(descricao));
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
