/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.FormularioTipoformulario;
import com.example.proyectoevaluaciondocente.service.EstudianteService;
import com.example.proyectoevaluaciondocente.service.FormularioTipoFormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author juanc
 */
@RestController
@RequestMapping("/api/formulariotipoformulario")
public class FormularioTipoFormularioController {

    @Autowired
    FormularioTipoFormularioService formularioTipoFormularioService;

    @GetMapping("/listar")
    public ResponseEntity<List<FormularioTipoformulario>> listar() {
        return new ResponseEntity<>(formularioTipoFormularioService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<FormularioTipoformulario> crear(@RequestBody FormularioTipoformulario ftf) {
        return new ResponseEntity<>(formularioTipoFormularioService.create(ftf), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<FormularioTipoformulario> eliminarFormularioTipoFormulario(@PathVariable Integer id) {
        formularioTipoFormularioService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<FormularioTipoformulario> actualizarFormularioTipoFormulario(@PathVariable Integer id, @RequestBody FormularioTipoformulario ftf) {
        FormularioTipoformulario formularioTipoformulario = formularioTipoFormularioService.findById(id);
        if (formularioTipoformulario == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                formularioTipoformulario.setIdtipoFormulario(ftf.getIdtipoFormulario());
                return new ResponseEntity<>(formularioTipoFormularioService.create(ftf), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

    }
}
