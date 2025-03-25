package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.OcupacaoModel;
import com.example.accessingdatapostgres.service.OcupacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ocupacao")
public class OcupacaoController {

    private final OcupacaoService service;

    public OcupacaoController(OcupacaoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<OcupacaoModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OcupacaoModel> getById(@PathVariable String id) {
        Optional<OcupacaoModel> ocupacao = service.findById(id);
        return ocupacao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<OcupacaoModel> create(@RequestBody OcupacaoModel ocupacao) {
        return ResponseEntity.ok(service.save(ocupacao));
    }

    @PutMapping("/{id}")
    public ResponseEntity<OcupacaoModel> update(@PathVariable String id, @RequestBody OcupacaoModel ocupacao) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(ocupacao));
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
