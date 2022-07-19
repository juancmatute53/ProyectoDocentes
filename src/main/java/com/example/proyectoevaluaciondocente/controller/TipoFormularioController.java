/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.TipoFormulario;
import com.example.proyectoevaluaciondocente.service.TipoFormularioService;
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
@RequestMapping("/api/tipoformulario")
public class TipoFormularioController {
    
    @Autowired
    TipoFormularioService tipoFormularioService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<TipoFormulario>> listar() {
        return new ResponseEntity<>(tipoFormularioService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<TipoFormulario> crear(@RequestBody TipoFormulario t) {
        return new ResponseEntity<>(tipoFormularioService.create(t), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<TipoFormulario> eliminarTipoFormulario(@PathVariable Integer id) {
        tipoFormularioService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<TipoFormulario> actualizarTipoFormulario(@PathVariable Integer id, @RequestBody TipoFormulario t) {
        TipoFormulario formulario = tipoFormularioService.findById(id);
        if (formulario == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                formulario.setObservacion(t.getObservacion());
                formulario.setPorcentaje(t.getPorcentaje());
                formulario.setTipoFormulario(t.getTipoFormulario());
                return new ResponseEntity<>(tipoFormularioService.create(t), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        
    }
}
