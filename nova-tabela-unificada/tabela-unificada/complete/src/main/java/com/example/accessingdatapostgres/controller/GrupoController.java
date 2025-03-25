package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.GrupoModel;
import com.example.accessingdatapostgres.service.GrupoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/grupo")
public class GrupoController {

    private final GrupoService service;

    public GrupoController(GrupoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<GrupoModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GrupoModel> getById(@PathVariable String id) {
        Optional<GrupoModel> grupo = service.findById(id);
        return grupo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<GrupoModel> create(@RequestBody GrupoModel grupo) {
        return ResponseEntity.ok(service.save(grupo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GrupoModel> update(@PathVariable String id, @RequestBody GrupoModel grupo) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(grupo));
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
