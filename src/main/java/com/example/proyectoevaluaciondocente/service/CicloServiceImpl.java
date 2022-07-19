/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Ciclo;
import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.repository.CicloRepository;
import com.example.proyectoevaluaciondocente.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author juanc
 */
@Service
public class CicloServiceImpl implements CicloService {

    @Autowired
    CicloRepository cicloRepository;

    @Override
    public Ciclo create(Ciclo c) {
        return cicloRepository.save(c);
    }

    @Override
    public Ciclo findById(Integer id) {

        return cicloRepository.findById(id).orElse(new Ciclo());
    }

    @Override
    public List<Ciclo> findByAll() {
        return cicloRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        cicloRepository.deleteById(id);
    }

}
