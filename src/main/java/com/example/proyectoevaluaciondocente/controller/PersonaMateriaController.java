/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.PersonaMateria;
import com.example.proyectoevaluaciondocente.service.EstudianteService;
import com.example.proyectoevaluaciondocente.service.PersonaMateriaService;
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
@RequestMapping("/api/personamateria")
public class PersonaMateriaController {
    
    @Autowired
    PersonaMateriaService personaMateriaService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<PersonaMateria>> listar() {
        return new ResponseEntity<>(personaMateriaService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<PersonaMateria> crear(@RequestBody PersonaMateria pm) {
        return new ResponseEntity<>(personaMateriaService.create(pm), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<PersonaMateria> eliminar(@PathVariable Integer id) {
        personaMateriaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    

}
