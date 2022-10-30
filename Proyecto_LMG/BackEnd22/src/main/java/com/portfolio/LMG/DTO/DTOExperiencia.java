/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.LMG.DTO;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Leo
 */
public class DTOExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descaripcionE;
    
    //Constr

    public DTOExperiencia() {
    }

    public DTOExperiencia(String nombreE, String descaripcionE) {
        this.nombreE = nombreE;
        this.descaripcionE = descaripcionE;
    }
    
    //G&S

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescaripcionE() {
        return descaripcionE;
    }

    public void setDescaripcionE(String descaripcionE) {
        this.descaripcionE = descaripcionE;
    }
    
    
}
