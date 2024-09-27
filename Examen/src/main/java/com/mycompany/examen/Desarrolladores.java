/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author danie
 */
class Desarrolladores extends Trabajadores{
 private double salarioF;
 private double bonificacion;

    public Desarrolladores(double salarioF,  String nombre, String codigo) {
        super(nombre, codigo);
        this.salarioF = salarioF;
        
    }
 
 @Override
  public double obtenerSueldos(){
  bonificacion= salarioF*0.95;
  return salarioF + bonificacion;
  }  
 
}
