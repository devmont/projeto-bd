package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.ModalidadeModel;
import com.example.accessingdatapostgres.service.ModalidadeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/modalidade")
public class ModalidadeController {

    private final ModalidadeService service;

    public ModalidadeController(ModalidadeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ModalidadeModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModalidadeModel> getById(@PathVariable String id) {
        Optional<ModalidadeModel> modalidade = service.findById(id);
        return modalidade.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ModalidadeModel> create(@RequestBody ModalidadeModel modalidade) {
        return ResponseEntity.ok(service.save(modalidade));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ModalidadeModel> update(@PathVariable String id, @RequestBody ModalidadeModel modalidade) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(modalidade));
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
