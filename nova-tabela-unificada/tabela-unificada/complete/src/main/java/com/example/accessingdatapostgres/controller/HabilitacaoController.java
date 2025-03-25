package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.HabilitacaoModel;
import com.example.accessingdatapostgres.service.HabilitacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/habilitacao")
public class HabilitacaoController {

    private final HabilitacaoService service;

    public HabilitacaoController(HabilitacaoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<HabilitacaoModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HabilitacaoModel> getById(@PathVariable String id) {
        Optional<HabilitacaoModel> habilitacao = service.findById(id);
        return habilitacao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<HabilitacaoModel> create(@RequestBody HabilitacaoModel habilitacao) {
        return ResponseEntity.ok(service.save(habilitacao));
    }

    @PutMapping("/{id}")
    public ResponseEntity<HabilitacaoModel> update(@PathVariable String id, @RequestBody HabilitacaoModel habilitacao) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(habilitacao));
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
