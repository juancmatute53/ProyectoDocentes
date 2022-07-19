/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.PeriodoAcademico;
import com.example.proyectoevaluaciondocente.repository.PeriodoAcademicoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juanc
 */
@Service
public class PeriodoAcademicoServiceImpl implements PeriodoAcademicoService{
   
 @Autowired
    PeriodoAcademicoRepository periodoAcademicoRepository;

    @Override
    public PeriodoAcademico create(PeriodoAcademico pa) {
        return periodoAcademicoRepository.save(pa);
    }

    @Override
    public PeriodoAcademico findById(Integer id) {
        return periodoAcademicoRepository.findById(id).orElse(new PeriodoAcademico());
    }

    @Override
    public List<PeriodoAcademico> findByAll() {
        return periodoAcademicoRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        periodoAcademicoRepository.deleteById(id);
    }

}
