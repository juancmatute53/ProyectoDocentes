/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.AsignacionCoevaluacion;
import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.service.AsignacionCoevaluacionService;
import com.example.proyectoevaluaciondocente.service.EstudianteService;
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
@RequestMapping("/api/evaluacioncoevaluacion")
public class AsignacionCoevaluacionController {
    
    @Autowired
    AsignacionCoevaluacionService asignacionCoevaluacionService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<AsignacionCoevaluacion>> listar() {
        return new ResponseEntity<>(asignacionCoevaluacionService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<AsignacionCoevaluacion> crear(@RequestBody AsignacionCoevaluacion e) {
        return new ResponseEntity<>(asignacionCoevaluacionService.create(e), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<AsignacionCoevaluacion> eliminar(@PathVariable Integer id) {
        asignacionCoevaluacionService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    

}
