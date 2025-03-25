package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.RedeAtencaoModel;
import com.example.accessingdatapostgres.service.RedeAtencaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rede-atencao")
public class RedeAtencaoController {

    private final RedeAtencaoService service;

    public RedeAtencaoController(RedeAtencaoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<RedeAtencaoModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RedeAtencaoModel> getById(@PathVariable String id) {
        Optional<RedeAtencaoModel> redeAtencao = service.findById(id);
        return redeAtencao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<RedeAtencaoModel> create(@RequestBody RedeAtencaoModel redeAtencao) {
        return ResponseEntity.ok(service.save(redeAtencao));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RedeAtencaoModel> update(@PathVariable String id, @RequestBody RedeAtencaoModel redeAtencao) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(redeAtencao));
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
