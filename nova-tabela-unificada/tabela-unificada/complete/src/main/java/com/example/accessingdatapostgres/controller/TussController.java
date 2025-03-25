package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.TussModel;
import com.example.accessingdatapostgres.service.TussService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tuss")
public class TussController {

    private final TussService service;

    public TussController(TussService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TussModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TussModel> getById(@PathVariable String id) {
        Optional<TussModel> tuss = service.findById(id);
        return tuss.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TussModel> create(@RequestBody TussModel tuss) {
        return ResponseEntity.ok(service.save(tuss));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TussModel> update(@PathVariable String id, @RequestBody TussModel tuss) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(tuss));
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
