/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.controller;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.Usuario;
import com.example.proyectoevaluaciondocente.service.EstudianteService;
import com.example.proyectoevaluaciondocente.service.UsuarioService;
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
@RequestMapping("/api/usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Usuario>> listar() {
        return new ResponseEntity<>(usuarioService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Usuario> crear(@RequestBody Usuario u) {
        return new ResponseEntity<>(usuarioService.create(u), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Usuario> eliminarUsuario(@PathVariable Integer id) {
        usuarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Integer id, @RequestBody Usuario u) {
        Usuario usuario = usuarioService.findById(id);
        if (usuario == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                usuario.setUsuario(u.getUsuario());
                usuario.setContrasenia(u.getContrasenia());
                usuario.setFechaHoraRegistro(u.getFechaHoraRegistro());
                usuario.setIdPersona(u.getIdPersona());
                usuario.setIdRol(u.getIdRol());
                return new ResponseEntity<>(usuarioService.create(u), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        
    }
}
