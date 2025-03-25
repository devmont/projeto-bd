package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.ServicoModel;
import com.example.accessingdatapostgres.service.ServicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/servico")
public class ServicoController {

    private final ServicoService service;

    public ServicoController(ServicoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ServicoModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServicoModel> getById(@PathVariable String id) {
        Optional<ServicoModel> servico = service.findById(id);
        return servico.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ServicoModel> create(@RequestBody ServicoModel servico) {
        return ResponseEntity.ok(service.save(servico));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServicoModel> update(@PathVariable String id, @RequestBody ServicoModel servico) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(servico));
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
