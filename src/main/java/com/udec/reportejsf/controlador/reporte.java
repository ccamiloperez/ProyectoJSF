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
 * @author Camilo Perez
 * @author Julian Arias
 */
@Named(value = "reporte")
@RequestScoped
public class reporte {

    logica log=new logica();
    /**
     * Inyeccion de dependencia
     */
    @Inject
    private principal principal;
    /**
     * Costructor de la clase
     */
    public reporte() {
    }
    /**
     * Getters y Setters de la varible principal
     * @return 
     */
    public principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(principal principal) {
        this.principal = principal;
    }
    /**
     * Metodo que llama la funcion de calcular el sueldo
     * @return el sueldo total
     */
    public double ejecutar(){
        
        principal.setSalario(log.calcularCuentaCobro(principal.getDias(), principal.getProfesion(), principal.getIdiomas() ));
        return principal.getSalario();
    }
    /**
     * Metodo que imprime los idiomas 
     * @param idioma
     * @return los idiomas seleccionados 
     */
    public String imprimirIdiomas(String [] idioma){
       String idiomas="";
       for(String a:idioma){
           if(a!=null){
                idiomas=idiomas+a+",";
           }
       }
    return idiomas;
    }
    /**
     * Metodo que llama la funcion que imprime el genero
     * @return el genero seleccionado
     */
   public String imprimirGenero(){
       principal.setGenero(log.tipoGenero(principal.getGenero()));
       return principal.getGenero();
   }
           
    
}
