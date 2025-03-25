package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.RubricaModel;
import com.example.accessingdatapostgres.service.RubricaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rubricas")
public class RubricaController {

    private final RubricaService service;

    public RubricaController(RubricaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<RubricaModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RubricaModel> getById(@PathVariable String id) {
        Optional<RubricaModel> rubrica = service.findById(id);
        return rubrica.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<RubricaModel> create(@RequestBody RubricaModel rubrica) {
        return ResponseEntity.ok(service.save(rubrica));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RubricaModel> update(@PathVariable String id, @RequestBody RubricaModel rubrica) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(rubrica));
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
