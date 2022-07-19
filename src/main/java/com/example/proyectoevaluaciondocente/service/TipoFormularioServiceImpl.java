/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.TipoFormulario;
import com.example.proyectoevaluaciondocente.repository.TipoFormularioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juanc
 */
@Service
public class TipoFormularioServiceImpl implements TipoFormularioService{
   
 @Autowired
    TipoFormularioRepository tipoFormularioRepository;

    @Override
    public TipoFormulario create(TipoFormulario t) {
        return tipoFormularioRepository.save(t);
    }

    @Override
    public TipoFormulario findById(Integer id) {
        return tipoFormularioRepository.findById(id).orElse(new TipoFormulario());
    }

    @Override
    public List<TipoFormulario> findByAll() {
        return tipoFormularioRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        tipoFormularioRepository.deleteById(id);
    }

}
