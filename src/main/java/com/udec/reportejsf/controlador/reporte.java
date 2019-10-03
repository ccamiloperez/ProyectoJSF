/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.reportejsf.controlador;

import com.udec.reportejsf.modelo.logica;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author ASUS
 */
@Named(value = "reporte")
@RequestScoped
public class reporte {

    @Inject
    private principal principal;
    
    public reporte() {
    }
    public principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(principal principal) {
        this.principal = principal;
    }
    
    public double ejecutar(){
        logica log=new logica();
        principal.setSalario(log.calcularCuentaCobro(principal.getDias(), principal.getProfesion(), principal.getIdiomas() ));
        return principal.getSalario();
    }
    public String imprimirIdiomas(String [] idioma){
       String idiomas="";
       for(String a:idioma){
           if(a!=null){
                idiomas=idiomas+a+",";
           }
       }
    return idiomas;
    }
    
    public String tipoGenero(String genero){
        String ger;
        if(genero.equals("mujer")){
            ger = "Señora";
           
        }else{
            ger="Señor";
        }
    return ger;
    }
    
}
