/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Estudiante;
import com.example.proyectoevaluaciondocente.model.FormularioTipoformulario;
import com.example.proyectoevaluaciondocente.repository.EstudianteRepository;
import com.example.proyectoevaluaciondocente.repository.FormularioTipoFormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author juanc
 */
@Service
public class FormularioTipoFormularioServiceImpl implements FormularioTipoFormularioService {

    @Autowired
    FormularioTipoFormularioRepository formularioTipoFormularioRepository;

    @Override
    public FormularioTipoformulario create(FormularioTipoformulario ftf) {
        return formularioTipoFormularioRepository.save(ftf);
    }

    @Override
    public FormularioTipoformulario findById(Integer id) {
        return formularioTipoFormularioRepository.findById(id).orElse(new FormularioTipoformulario());
    }

    @Override
    public List<FormularioTipoformulario> findByAll() {
        return formularioTipoFormularioRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        formularioTipoFormularioRepository.deleteById(id);
    }

}
