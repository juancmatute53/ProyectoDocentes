/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Carrera;
import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.repository.CarreraRepository;
import com.example.proyectoevaluaciondocente.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author juanc
 */
@Service
public class CarreraServiceImpl implements CarreraService{
   
 @Autowired
 CarreraRepository carreraRepository;

    @Override
    public Carrera create(Carrera c) {
        return carreraRepository.save(c);
    }

    @Override
    public Carrera findById(Integer id) {
        return carreraRepository.findById(id).orElse(new Carrera());
    }

    @Override
    public List<Carrera> findByAll() {
        return carreraRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        carreraRepository.deleteById(id);
    }

}
