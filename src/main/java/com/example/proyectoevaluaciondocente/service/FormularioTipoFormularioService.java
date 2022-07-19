/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.FormularioTipoformulario;

import java.util.List;

/**
 *
 * @author juanc
 */
public interface FormularioTipoFormularioService {

    public FormularioTipoformulario create(FormularioTipoformulario ftf);

    public FormularioTipoformulario findById(Integer id);

    public List<FormularioTipoformulario> findByAll();

    public void delete(Integer id);
}
