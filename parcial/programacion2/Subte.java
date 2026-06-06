/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.programacion2;

/**
 *
 * @author thiag
 */
public class Subte extends VehiculoTransporte{
     protected double valorPorPasajero;
    protected int CantidadDePasajeros ;

    public Subte(double valorPorPasajero, int CantidadDePasajeros, String patente, int capacidad, String empresa, String pasajeros) {
        super(patente, capacidad, empresa, pasajeros);
        this.valorPorPasajero = valorPorPasajero;
        this.CantidadDePasajeros = CantidadDePasajeros;
    }
 

    @Override
    public String toString() {
        return "Subte{" + "valorPorPasajero=" + valorPorPasajero + ", CantidadDePasajeros=" + CantidadDePasajeros + '}';
    }
    
    @Override
      public double calcularCostoBase(){
          double totalPasajeSubte = valorPorPasajero * CantidadDePasajeros; 
          System.out.println("El costo base es: " + totalPasajeSubte);
          return totalPasajeSubte; 
      }
}
