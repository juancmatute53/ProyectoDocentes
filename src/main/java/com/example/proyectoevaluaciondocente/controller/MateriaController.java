/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.Materia;
import com.example.proyectoevaluaciondocente.service.EstudianteService;
import com.example.proyectoevaluaciondocente.service.MateriaService;
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
@RequestMapping("/api/materia")
public class MateriaController {
    
    @Autowired
    MateriaService materiaService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Materia>> listar() {
        return new ResponseEntity<>(materiaService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Materia> crear(@RequestBody Materia m) {
        return new ResponseEntity<>(materiaService.create(m), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Materia> eliminarMateria(@PathVariable Integer id) {
        materiaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Materia> actualizarMateria(@PathVariable Integer id, @RequestBody Materia m) {
        Materia materia = materiaService.findById(id);
        if (materia == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                materia.setNombreMateria(m.getNombreMateria());
                materia.setIdCiclo(m.getIdCiclo());
                return new ResponseEntity<>(materiaService.create(m), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        
    }
}
