/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Ciclo;
import com.example.proyectoevaluaciondocente.service.CicloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author juanc
 */
@RestController
@RequestMapping("/api/ciclo")
public class CicloController {
    
    @Autowired
    CicloService cicloService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Ciclo>> listar() {
        return new ResponseEntity<>(cicloService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Ciclo> crear(@RequestBody Ciclo c) {
        return new ResponseEntity<>(cicloService.create(c), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Ciclo> eliminarCiclo(@PathVariable Integer id) {
        cicloService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Ciclo> actualizarCiclo(@PathVariable Integer id, @RequestBody Ciclo c) {
        Ciclo ciclo = cicloService.findById(id);
        if (ciclo == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                ciclo.setCiclo(c.getCiclo());
                ciclo.setObservaciones(c.getCiclo());
                ciclo.setIdCarrera(c.getIdCarrera());
                return new ResponseEntity<>(cicloService.create(c), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        
    }
}
