package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.ComponenteRedeModel;
import com.example.accessingdatapostgres.service.ComponenteRedeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/componentes-rede")
public class ComponenteRedeController {

    private final ComponenteRedeService service;

    public ComponenteRedeController(ComponenteRedeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ComponenteRedeModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ComponenteRedeModel> getById(@PathVariable String id) {
        Optional<ComponenteRedeModel> componente = service.findById(id);
        return componente.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ComponenteRedeModel> create(@RequestBody ComponenteRedeModel componente) {
        return ResponseEntity.ok(service.save(componente));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ComponenteRedeModel> update(@PathVariable String id, @RequestBody ComponenteRedeModel componente) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(componente));
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
