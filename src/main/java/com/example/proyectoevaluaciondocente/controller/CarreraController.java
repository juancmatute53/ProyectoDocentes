/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Carrera;
import com.example.proyectoevaluaciondocente.service.CarreraService;
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
@RequestMapping("/api/carrera")
public class CarreraController {
    
    @Autowired
    CarreraService carreraService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Carrera>> listar() {
        return new ResponseEntity<>(carreraService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Carrera> crear(@RequestBody Carrera c) {
        return new ResponseEntity<>(carreraService.create(c), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Carrera> eliminarCarrera(@PathVariable Integer id) {
        carreraService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Carrera> actualizarCarrera(@PathVariable Integer id, @RequestBody Carrera c) {
        Carrera carrera = carreraService.findById(id);
        if (carrera == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                carrera.setNombreCarrera(c.getNombreCarrera());
                carrera.setDescripcion(c.getDescripcion());
                carrera.setIdPeriodoAcademico(c.getIdPeriodoAcademico());

                return new ResponseEntity<>(carreraService.create(c), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        
    }
}
