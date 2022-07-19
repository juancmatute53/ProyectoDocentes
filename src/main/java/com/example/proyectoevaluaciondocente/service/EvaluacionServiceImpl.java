/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.Evaluacion;
import com.example.proyectoevaluaciondocente.repository.EstudianteRepository;
import com.example.proyectoevaluaciondocente.repository.EvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author juanc
 */
@Service
public class EvaluacionServiceImpl implements EvaluacionService {

    @Autowired
    EvaluacionRepository evaluacionRepository;

    @Override
    public Evaluacion create(Evaluacion e) {
        return evaluacionRepository.save(e);
    }

    @Override
    public Evaluacion findById(Integer id) {
        return evaluacionRepository.findById(id).orElse(new Evaluacion());
    }

    @Override
    public List<Evaluacion> findByAll() {
        return evaluacionRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        evaluacionRepository.deleteById(id);
    }

}
