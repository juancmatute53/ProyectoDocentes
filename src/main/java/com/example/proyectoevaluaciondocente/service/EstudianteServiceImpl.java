/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.repository.EstudianteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juanc
 */
@Service
public class EstudianteServiceImpl implements EstudianteService{
   
 @Autowired
    EstudianteRepository estudianteRepository;

    @Override
    public Estudiante create(Estudiante e) {
        return estudianteRepository.save(e);
    }

    @Override
    public Estudiante findById(Integer id) {
        return estudianteRepository.findById(id).orElse(new Estudiante());
    }

    @Override
    public List<Estudiante> findByAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        estudianteRepository.deleteById(id);
    }

}
