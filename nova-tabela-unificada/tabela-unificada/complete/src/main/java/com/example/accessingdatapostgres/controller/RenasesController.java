package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.RenasesModel;
import com.example.accessingdatapostgres.service.RenasesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/renases")
public class RenasesController {

    private final RenasesService service;

    public RenasesController(RenasesService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<RenasesModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RenasesModel> getById(@PathVariable String id) {
        Optional<RenasesModel> renases = service.findById(id);
        return renases.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<RenasesModel> create(@RequestBody RenasesModel renases) {
        return ResponseEntity.ok(service.save(renases));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RenasesModel> update(@PathVariable String id, @RequestBody RenasesModel renases) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(renases));
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
