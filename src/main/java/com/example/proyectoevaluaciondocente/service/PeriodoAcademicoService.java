/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.PeriodoAcademico;
import java.util.List;

/**
 *
 * @author juanc
 */
public interface PeriodoAcademicoService {

    public PeriodoAcademico create(PeriodoAcademico pa);

    public PeriodoAcademico findById(Integer id);

    public List<PeriodoAcademico> findByAll();

    public void delete(Integer id);
}
