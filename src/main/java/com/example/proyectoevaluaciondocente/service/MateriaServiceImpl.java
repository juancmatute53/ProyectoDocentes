/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.Materia;
import com.example.proyectoevaluaciondocente.repository.EstudianteRepository;
import com.example.proyectoevaluaciondocente.repository.MateriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juanc
 */
@Service
public class MateriaServiceImpl implements MateriaService{
   
 @Autowired
    MateriaRepository materiaRepository;

    @Override
    public Materia create(Materia m) {
        return materiaRepository.save(m);
    }

    @Override
    public Materia findById(Integer id) {
        return materiaRepository.findById(id).orElse(new Materia());
    }

    @Override
    public List<Materia> findByAll() {
        return materiaRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        materiaRepository.deleteById(id);
    }

}
