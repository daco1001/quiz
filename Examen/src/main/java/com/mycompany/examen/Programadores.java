/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author danie
 */
class Programadores extends Trabajadores {
  private double salarioFijo;
  
    public Programadores(double salarioFijo, String nombre, String codigo) {
        super(nombre, codigo);
        this.salarioFijo = salarioFijo;
    }

  @Override
  public double obtenerSueldos(){
  return salarioFijo;
  }

   
 
}
