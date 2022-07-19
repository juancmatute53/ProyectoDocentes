/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.Formulario;
import java.util.List;

/**
 *
 * @author juanc
 */
public interface FormularioService {

    public Formulario create(Formulario f);

    public Formulario findById(Integer id);

    public List<Formulario> findByAll();

    public void delete(Integer id);
}
