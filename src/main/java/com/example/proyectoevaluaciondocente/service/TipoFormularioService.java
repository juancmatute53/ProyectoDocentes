/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.TipoFormulario;
import java.util.List;

/**
 *
 * @author juanc
 */
public interface TipoFormularioService {

    public TipoFormulario create(TipoFormulario t);

    public TipoFormulario findById(Integer id);

    public List<TipoFormulario> findByAll();

    public void delete(Integer id);
}
