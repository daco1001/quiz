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
    private double salarioFijo;
    private double descuento;

    public Analistas(double salarioFijo, double descuento, String nombre, String codigo) {
        super(nombre, codigo);
        this.salarioFijo = salarioFijo;
        this.descuento = descuento;
    }
  @Override
  public double obtenerSueldos(){
  descuento=0.96;
  return salarioFijo*descuento;
  }  
    
}
