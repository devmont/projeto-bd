package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.GrupoHabilitacaoModel;
import com.example.accessingdatapostgres.service.GrupoHabilitacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/grupo-habilitacao")
public class GrupoHabilitacaoController {

    private final GrupoHabilitacaoService service;

    public GrupoHabilitacaoController(GrupoHabilitacaoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<GrupoHabilitacaoModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GrupoHabilitacaoModel> getById(@PathVariable String id) {
        Optional<GrupoHabilitacaoModel> grupoHabilitacao = service.findById(id);
        return grupoHabilitacao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<GrupoHabilitacaoModel> create(@RequestBody GrupoHabilitacaoModel grupoHabilitacao) {
        return ResponseEntity.ok(service.save(grupoHabilitacao));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GrupoHabilitacaoModel> update(@PathVariable String id, @RequestBody GrupoHabilitacaoModel grupoHabilitacao) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(grupoHabilitacao));
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
