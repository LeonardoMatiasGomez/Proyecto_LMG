/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.LMG.Security.Service;

import com.portfolio.LMG.Security.Entity.Usuario;
import com.portfolio.LMG.Security.Repository.IntUsuarioRepository;
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
public class UsuarioService {
    @Autowired
    IntUsuarioRepository intUsuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return intUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return intUsuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return intUsuarioRepository.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        intUsuarioRepository.save(usuario);
    }
}
