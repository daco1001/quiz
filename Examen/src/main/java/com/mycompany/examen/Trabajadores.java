/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author danie
 */
abstract class Trabajadores {
  protected String nombre ;
  protected String codigo;

    public Trabajadores(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
  
  public abstract double obtenerSueldos();
 
}