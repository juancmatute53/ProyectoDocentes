/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.Evaluacion;

import java.util.List;

/**
 *
 * @author juanc
 */
public interface EvaluacionService {

    public Evaluacion create(Evaluacion e);

    public Evaluacion findById(Integer id);

    public List<Evaluacion> findByAll();

    public void delete(Integer id);
}
