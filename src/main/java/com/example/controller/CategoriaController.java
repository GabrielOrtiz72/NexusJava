package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.model.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @GetMapping("/{id}")
    public ResponseEntity<?> detalhesCategoria(@PathVariable Long id) {
        
        return ResponseEntity.ok(new Categoria(1L, "Teclados", "keyboard"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> apagarCategoria(@PathVariable Long id) {
        
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarCategoria(@PathVariable Long id, @RequestBody Categoria categoria) {
       
        categoria.setId(id); 
        return ResponseEntity.ok(categoria);
    }
}
