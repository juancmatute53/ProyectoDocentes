/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.PersonaMateria;

import java.util.List;

/**
 *
 * @author juanc
 */
public interface PersonaMateriaService {

    public PersonaMateria create(PersonaMateria pm);

    public PersonaMateria findById(Integer id);

    public List<PersonaMateria> findByAll();

    public void delete(Integer id);
}
