/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.Persona;
import java.util.List;

/**
 *
 * @author juanc
 */
public interface PersonaService {

    public Persona create(Persona p);

    public Persona findById(Integer id);

    public List<Persona> findByAll();

    public void delete(Integer id);
}
