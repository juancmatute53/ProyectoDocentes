/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.Materia;
import java.util.List;

/**
 *
 * @author juanc
 */
public interface MateriaService {

    public Materia create(Materia m);

    public Materia findById(Integer id);

    public List<Materia> findByAll();

    public void delete(Integer id);
}
