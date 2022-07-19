/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.PeriodoAcademico;
import com.example.proyectoevaluaciondocente.service.EstudianteService;
import com.example.proyectoevaluaciondocente.service.PeriodoAcademicoService;
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
@RequestMapping("/api/periodoacademico")
public class PeriodoAcademicoController {
    
    @Autowired
    PeriodoAcademicoService periodoAcademicoService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<PeriodoAcademico>> listar() {
        return new ResponseEntity<>(periodoAcademicoService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<PeriodoAcademico> crear(@RequestBody PeriodoAcademico pa) {
        return new ResponseEntity<>(periodoAcademicoService.create(pa), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<PeriodoAcademico> eliminarPeriodoAcademico(@PathVariable Integer id) {
        periodoAcademicoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<PeriodoAcademico> actualizarPeriodoAcademico(@PathVariable Integer id, @RequestBody PeriodoAcademico pa) {
        PeriodoAcademico periodoAcademico = periodoAcademicoService.findById(id);
        if (periodoAcademico == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                periodoAcademico.setPeriodo(pa.getPeriodo());
                periodoAcademico.setFechaInicio(pa.getFechaInicio());
                periodoAcademico.setFechaFin(pa.getFechaFin());
                return new ResponseEntity<>(periodoAcademicoService.create(pa), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        
    }
}
