package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.SiaSihModel;
import com.example.accessingdatapostgres.service.SiaSihService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sia-sih")
public class SiaSihController {

    private final SiaSihService service;

    public SiaSihController(SiaSihService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<SiaSihModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SiaSihModel> getById(@PathVariable String id) {
        Optional<SiaSihModel> siaSih = service.findById(id);
        return siaSih.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<SiaSihModel> create(@RequestBody SiaSihModel siaSih) {
        return ResponseEntity.ok(service.save(siaSih));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SiaSihModel> update(@PathVariable String id, @RequestBody SiaSihModel siaSih) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(siaSih));
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
