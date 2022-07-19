/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juanc
 */
@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {
    
    @Autowired
    EstudianteService estudianteService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Estudiante>> listar() {
        return new ResponseEntity<>(estudianteService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Estudiante> crear(@RequestBody Estudiante e) {
        return new ResponseEntity<>(estudianteService.create(e), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Estudiante> eliminarEstudiante(@PathVariable Integer id) {
        estudianteService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Estudiante> actualizarEstudiante(@PathVariable Integer id, @RequestBody Estudiante e) {
        Estudiante estudiante = estudianteService.findById(id);
        if (estudiante == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                estudiante.setNombre(e.getNombre());
                estudiante.setApellido(e.getApellido());
                estudiante.setCedula(e.getCedula());
                return new ResponseEntity<>(estudianteService.create(e), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        
    }
}
