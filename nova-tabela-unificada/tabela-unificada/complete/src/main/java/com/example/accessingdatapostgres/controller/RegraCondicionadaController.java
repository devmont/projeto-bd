package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.RegraCondicionadaModel;
import com.example.accessingdatapostgres.service.RegraCondicionadaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/regras-condicionadas")
public class RegraCondicionadaController {

    private final RegraCondicionadaService service;

    public RegraCondicionadaController(RegraCondicionadaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<RegraCondicionadaModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegraCondicionadaModel> getById(@PathVariable String id) {
        Optional<RegraCondicionadaModel> regra = service.findById(id);
        return regra.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<RegraCondicionadaModel> create(@RequestBody RegraCondicionadaModel regra) {
        return ResponseEntity.ok(service.save(regra));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RegraCondicionadaModel> update(@PathVariable String id, @RequestBody RegraCondicionadaModel regra) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(regra));
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
