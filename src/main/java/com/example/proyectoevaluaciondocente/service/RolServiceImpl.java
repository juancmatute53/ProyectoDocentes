/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.Rol;
import com.example.proyectoevaluaciondocente.repository.EstudianteRepository;
import com.example.proyectoevaluaciondocente.repository.RolRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juanc
 */
@Service
public class RolServiceImpl implements RolService{
   
 @Autowired
    RolRepository rolRepository;

    @Override
    public Rol create(Rol r) {
        return rolRepository.save(r);
    }

    @Override
    public Rol findById(Integer id) {
        return rolRepository.findById(id).orElse(new Rol());
    }

    @Override
    public List<Rol> findByAll() {
        return rolRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        rolRepository.deleteById(id);
    }

}
