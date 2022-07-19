/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.Usuario;
import com.example.proyectoevaluaciondocente.repository.EstudianteRepository;
import com.example.proyectoevaluaciondocente.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juanc
 */
@Service
public class UsuarioServiceImpl implements UsuarioService{
   
 @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario create(Usuario u) {
        return usuarioRepository.save(u);
    }

    @Override
    public Usuario findById(Integer id) {
        return usuarioRepository.findById(id).orElse(new Usuario());
    }

    @Override
    public List<Usuario> findByAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        usuarioRepository.deleteById(id);
    }

}
