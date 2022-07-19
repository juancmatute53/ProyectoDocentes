/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.AsignacionCoevaluacion;
import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.repository.AsignacionCoevaluacionRepository;
import com.example.proyectoevaluaciondocente.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author juanc
 */
@Service
public class AsignacionCoevaluacionServiceImpl implements AsignacionCoevaluacionService {

    @Autowired
    AsignacionCoevaluacionRepository asignacionCoevaluacionRepository;

    @Override
    public AsignacionCoevaluacion create(AsignacionCoevaluacion e) {
        return asignacionCoevaluacionRepository.save(e);
    }

    @Override
    public AsignacionCoevaluacion findById(Integer id) {
        return asignacionCoevaluacionRepository.findById(id).orElse(new AsignacionCoevaluacion());
    }

    @Override
    public List<AsignacionCoevaluacion> findByAll() {
        return asignacionCoevaluacionRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        asignacionCoevaluacionRepository.deleteById(id);
    }

}
