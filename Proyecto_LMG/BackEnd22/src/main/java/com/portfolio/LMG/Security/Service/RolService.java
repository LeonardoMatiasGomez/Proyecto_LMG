/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.LMG.Security.Service;

import com.portfolio.LMG.Security.Entity.Rol;
import com.portfolio.LMG.Security.Enums.RolNombre;
import com.portfolio.LMG.Security.Repository.IntRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
/**
 *
 * @author Leo
 */
public class RolService {
    @Autowired
    IntRolRepository intRolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return intRolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        intRolRepository.save(rol);
    }
}
