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
 private double salarioFijo;
 private double bonificacion;

    public Desarrolladores(double salarioFijo, double bonificacion, String nombre, String codigo) {
        super(nombre, codigo);
        this.salarioFijo = salarioFijo;
        this.bonificacion = bonificacion;
    }
 
 @Override
  public double obtenerSueldos(){
  bonificacion= salarioFijo*0.95;
  return salarioFijo + bonificacion;
  }  
 
}
