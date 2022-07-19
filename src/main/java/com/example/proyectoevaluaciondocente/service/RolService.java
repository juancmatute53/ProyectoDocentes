/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectoevaluaciondocente.service;

import com.example.proyectoevaluaciondocente.model.Rol;
import java.util.List;

/**
 *
 * @author juanc
 */
public interface RolService {

    public Rol create(Rol r);

    public Rol findById(Integer id);

    public List<Rol> findByAll();

    public void delete(Integer id);
}
