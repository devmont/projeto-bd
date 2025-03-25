package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.SubGrupoModel;
import com.example.accessingdatapostgres.service.SubGrupoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sub-grupo")
public class SubGrupoController {

    private final SubGrupoService service;

    public SubGrupoController(SubGrupoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<SubGrupoModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubGrupoModel> getById(@PathVariable String id) {
        Optional<SubGrupoModel> subGrupo = service.findById(id);
        return subGrupo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<SubGrupoModel> create(@RequestBody SubGrupoModel subGrupo) {
        return ResponseEntity.ok(service.save(subGrupo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SubGrupoModel> update(@PathVariable String id, @RequestBody SubGrupoModel subGrupo) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(subGrupo));
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
