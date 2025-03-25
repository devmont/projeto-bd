package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.RegistroModel;
import com.example.accessingdatapostgres.service.RegistroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/registros")
public class RegistroController {

    private final RegistroService service;

    public RegistroController(RegistroService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<RegistroModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistroModel> getById(@PathVariable String id) {
        Optional<RegistroModel> registro = service.findById(id);
        return registro.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<RegistroModel> create(@RequestBody RegistroModel registro) {
        return ResponseEntity.ok(service.save(registro));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RegistroModel> update(@PathVariable String id, @RequestBody RegistroModel registro) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(registro));
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
