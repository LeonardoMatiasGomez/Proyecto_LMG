/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.LMG.Service;

import com.portfolio.LMG.Entity.Persona;
import com.portfolio.LMG.Interface.IntPersonaService;
import com.portfolio.LMG.Repository.IntPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author Leo
 */
public class ImpPersonaService implements IntPersonaService{
    @Autowired IntPersonaRepository IntPersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = IntPersonaRepository.findAll();
        return persona;        
    }

    @Override
    public void savePersona(Persona persona) {
        IntPersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        IntPersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPerona(Long id) {
        Persona persona = IntPersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
