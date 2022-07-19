/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.Usuario;
import java.util.List;

/**
 *
 * @author juanc
 */
public interface UsuarioService {

    public Usuario create(Usuario u);

    public Usuario findById(Integer id);

    public List<Usuario> findByAll();

    public void delete(Integer id);
}
