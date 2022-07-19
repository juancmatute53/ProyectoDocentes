/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.AsignacionCoevaluacion;
import com.example.proyectoevaluaciondocente.model.Estudiante;

import java.util.List;

/**
 *
 * @author juanc
 */
public interface AsignacionCoevaluacionService {

    public AsignacionCoevaluacion create(AsignacionCoevaluacion e);

    public AsignacionCoevaluacion findById(Integer id);

    public List<AsignacionCoevaluacion> findByAll();

    public void delete(Integer id);
}
