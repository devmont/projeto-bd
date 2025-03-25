package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.ProcedimentoModel;
import com.example.accessingdatapostgres.service.ProcedimentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/procedimentos")
public class ProcedimentoController {

    private final ProcedimentoService service;

    public ProcedimentoController(ProcedimentoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ProcedimentoModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProcedimentoModel> getById(@PathVariable String id) {
        Optional<ProcedimentoModel> procedimento = service.findById(id);
        return procedimento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ProcedimentoModel> create(@RequestBody ProcedimentoModel procedimento) {
        return ResponseEntity.ok(service.save(procedimento));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProcedimentoModel> update(@PathVariable String id, @RequestBody ProcedimentoModel procedimento) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(procedimento));
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
