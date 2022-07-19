/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyectoevaluaciondocente.repository;

import com.example.proyectoevaluaciondocente.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author juanc
 */
public interface MateriaRepository extends JpaRepository<Materia, Integer>{
    
}
