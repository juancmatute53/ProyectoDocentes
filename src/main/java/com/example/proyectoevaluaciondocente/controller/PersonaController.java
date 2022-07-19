/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.Persona;
import com.example.proyectoevaluaciondocente.service.EstudianteService;
import com.example.proyectoevaluaciondocente.service.PersonaService;
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
@RequestMapping("/api/persona")
public class PersonaController {
    
    @Autowired
    PersonaService personaService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Persona>> listar() {
        return new ResponseEntity<>(personaService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Persona> crear(@RequestBody Persona p) {
        return new ResponseEntity<>(personaService.create(p), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Estudiante> eliminarPersona(@PathVariable Integer id) {
        personaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Persona> actualizarPersona(@PathVariable Integer id, @RequestBody Persona p) {
        Persona persona = personaService.findById(id);
        if (persona == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                persona.setNombre(p.getNombre());
                persona.setApellido(p.getApellido());
                persona.setFechaNacimiento(p.getFechaNacimiento());
                persona.setCedula(p.getCedula());
                persona.setCelular(p.getCelular());
                persona.setCorreo(p.getCorreo());
                persona.setGenero(p.getGenero());
                persona.setDireccion(p.getDireccion());
                persona.setFoto(p.getFoto());
                persona.setIntruccion(p.getIntruccion());
                persona.setEstadoEvaluacion(p.getEstadoEvaluacion());
                persona.setEstadoComision(p.getEstadoComision());
                return new ResponseEntity<>(personaService.create(p), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        
    }
}
