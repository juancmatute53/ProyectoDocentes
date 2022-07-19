/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.Persona;
import com.example.proyectoevaluaciondocente.repository.EstudianteRepository;
import com.example.proyectoevaluaciondocente.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juanc
 */
@Service
public class PersonaServiceImpl implements PersonaService{
   
 @Autowired
    PersonaRepository personaRepository;

    @Override
    public Persona create(Persona p) {
        return personaRepository.save(p);
    }

    @Override
    public Persona findById(Integer id) {
        return personaRepository.findById(id).orElse(new Persona());
    }

    @Override
    public List<Persona> findByAll() {
        return personaRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        personaRepository.deleteById(id);
    }

}
