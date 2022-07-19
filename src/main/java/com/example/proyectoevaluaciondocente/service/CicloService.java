/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Ciclo;
import com.example.proyectoevaluaciondocente.model.Estudiante;

import java.util.List;

/**
 *
 * @author juanc
 */
public interface CicloService {

    public Ciclo create(Ciclo c);

    public Ciclo findById(Integer id);

    public List<Ciclo> findByAll();

    public void delete(Integer id);
}
