/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.PersonaMateria;
import com.example.proyectoevaluaciondocente.repository.EstudianteRepository;
import com.example.proyectoevaluaciondocente.repository.PersonaMateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author juanc
 */
@Service
public class PersonaMateriaServiceImpl implements PersonaMateriaService {

    @Autowired
    PersonaMateriaRepository personaMateriaRepository;

    @Override
    public PersonaMateria create(PersonaMateria pm) {
        return personaMateriaRepository.save(pm);
    }

    @Override
    public PersonaMateria findById(Integer id) {
        return personaMateriaRepository.findById(id).orElse(new PersonaMateria());
    }

    @Override
    public List<PersonaMateria> findByAll() {
        return personaMateriaRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        personaMateriaRepository.deleteById(id);
    }

}
