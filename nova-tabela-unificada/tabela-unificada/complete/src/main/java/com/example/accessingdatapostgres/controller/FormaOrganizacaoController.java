package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.FormaOrganizacaoModel;
import com.example.accessingdatapostgres.service.FormaOrganizacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/forma-organizacao")
public class FormaOrganizacaoController {

    private final FormaOrganizacaoService service;

    public FormaOrganizacaoController(FormaOrganizacaoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<FormaOrganizacaoModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FormaOrganizacaoModel> getById(@PathVariable String id) {
        Optional<FormaOrganizacaoModel> formaOrganizacao = service.findById(id);
        return formaOrganizacao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<FormaOrganizacaoModel> create(@RequestBody FormaOrganizacaoModel formaOrganizacao) {
        return ResponseEntity.ok(service.save(formaOrganizacao));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FormaOrganizacaoModel> update(@PathVariable String id, @RequestBody FormaOrganizacaoModel formaOrganizacao) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(formaOrganizacao));
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
