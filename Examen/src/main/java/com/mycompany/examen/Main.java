/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Main {

    public static void main(String[] args) {
     Scanner sc =new Scanner (System.in);
       System.out.println("Ingrese el numero de empleados que va ingresar");
     int numEmpleados = sc.nextInt();
     Trabajadores[] empleados = new Trabajadores [numEmpleados];
     for (int i=0; i < numEmpleados;i++) {
        System.out.println("Ingrese el tipo de empleado\n programador, analista,desarrolador");
    String tipoTrabajador =sc.next();
         System.out.println("Ingrse el nombre del empleado");
    String nombre = sc.next();
    System.out.println("Ingrse el nombre codigo del empleado");
    String codigo = sc.next();
     
    switch (tipoTrabajador) {
                case "programador":
                    System.out.print("Ingrese el salario fijo  : ");
                    double salarioFijo = sc.nextDouble();
                    empleados[i] = new Programadores(salarioFijo, nombre, codigo);
                    break;
      }       
    }
  }
}