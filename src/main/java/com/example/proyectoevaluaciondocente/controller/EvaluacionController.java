/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.Evaluacion;
import com.example.proyectoevaluaciondocente.service.EstudianteService;
import com.example.proyectoevaluaciondocente.service.EvaluacionService;
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
@RequestMapping("/api/evaluacion")
public class EvaluacionController {
    
    @Autowired
    EvaluacionService evaluacionService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Evaluacion>> listar() {
        return new ResponseEntity<>(evaluacionService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Evaluacion> crear(@RequestBody Evaluacion e) {
        return new ResponseEntity<>(evaluacionService.create(e), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Evaluacion> eliminarEvaluacion(@PathVariable Integer id) {
        evaluacionService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Evaluacion> actualizarEvaluacion(@PathVariable Integer id, @RequestBody Evaluacion e) {
        Evaluacion evaluacion = evaluacionService.findById(id);
        if (evaluacion == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                evaluacion.setCalificacion(e.getCalificacion());
                evaluacion.setFecha(e.getFecha());
                evaluacion.setObservacion(e.getObservacion());
                evaluacion.setIdCarrera(e.getIdCarrera());
                evaluacion.setIdCiclo(e.getIdCiclo());
                evaluacion.setIdFormulario(e.getIdFormulario());
                evaluacion.setIdMateria(e.getIdMateria());
                evaluacion.setIdPersona(e.getIdPersona());
                evaluacion.setIdTipoFormulario(e.getIdTipoFormulario());

                return new ResponseEntity<>(evaluacionService.create(e), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        
    }
}
