/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.reportejsf.modelo;

/**
 *
 * @author ASUS
 */
public class logica {
  
    public double calcularProfesion(String profesion){
        double sueldo;
        if(profesion.equals("ingeniero")){
            sueldo=200000;
        }else if (profesion.equals("tecnologo")) {
            sueldo=150000;
        }
        else if (profesion.equals("tecnico")) {
            sueldo=100000;
        }else{
            sueldo=50000;
        }
        return sueldo;
    }
    
     public double calcularIdioma(String[] idioma){
        double sueldo=0;
        for (String idioma1 : idioma) {
            if (idioma1.equals("ingles")) {
                sueldo=+250000;
            } else if (idioma1.equals("frances")) {
                sueldo=+330000;
            } else if (idioma1.equals("aleman")) {
                sueldo=+500000;
            } else {
                sueldo=+0;
            }
        }
        
        return sueldo;
    }
     
     public double calcularUbicacion(String ubicacion){
        double sueldo;
        if(ubicacion.equals("afueras")){
            sueldo=80000;
        }else{
            sueldo=0;
        }
        return sueldo;
    }
     
     public double calcularCuentaCobro(int dias, String profesion,String[]idioma){
         double salario;
        salario=(dias*calcularProfesion(profesion))+calcularIdioma(idioma);
        return salario;
     }
    
    
}
