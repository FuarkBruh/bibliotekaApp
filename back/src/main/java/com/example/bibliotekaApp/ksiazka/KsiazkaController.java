package com.example.bibliotekaApp.ksiazka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/ksiazki")
public class KsiazkaController {
    @Autowired
    private KsiazkaService ksiazkaService;

    @Autowired
    public KsiazkaController(KsiazkaService ksiazkaService) {
        this.ksiazkaService = ksiazkaService;
    }
    @PostMapping
    public ResponseEntity<Ksiazka> saveKsiazka(@RequestBody Ksiazka ksiazka) {
        Ksiazka savedKsiazka = ksiazkaService.saveKsiazka(ksiazka);
        return ResponseEntity.status(201).body(savedKsiazka);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ksiazka> getKsiazkaById(@PathVariable Integer id) {
        Ksiazka ksiazka = ksiazkaService.findKsiazkaById(id);
        if(ksiazka != null) {
            return ResponseEntity.ok(ksiazka);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}
