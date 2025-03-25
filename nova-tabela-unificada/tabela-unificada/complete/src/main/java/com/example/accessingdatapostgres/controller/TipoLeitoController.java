package com.example.accessingdatapostgres.controller;

import com.example.accessingdatapostgres.model.TipoLeitoModel;
import com.example.accessingdatapostgres.service.TipoLeitoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipo-leito")
public class TipoLeitoController {

    private final TipoLeitoService service;

    public TipoLeitoController(TipoLeitoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TipoLeitoModel>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoLeitoModel> getById(@PathVariable String id) {
        Optional<TipoLeitoModel> tipoLeito = service.findById(id);
        return tipoLeito.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TipoLeitoModel> create(@RequestBody TipoLeitoModel tipoLeito) {
        return ResponseEntity.ok(service.save(tipoLeito));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoLeitoModel> update(@PathVariable String id, @RequestBody TipoLeitoModel tipoLeito) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.save(tipoLeito));
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
