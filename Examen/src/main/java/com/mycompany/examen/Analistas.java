/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author danie
 */
class Analistas extends Trabajadores {

    private double salario;
    private double descuento;
    
    public Analistas(String nombre, String codigo, double salario) {
        super(nombre, codigo);
     this.salario=salario;
    }


   
  @Override
  public double obtenerSueldos(){
  descuento=0.96;
  return salario*descuento;
  }  
    
}
