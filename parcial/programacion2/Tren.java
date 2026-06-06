/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.programacion2;

/**
 *
 * @author thiag
 */
public class Tren extends VehiculoTransporte{
    protected double valorPorEstacion;
    protected int EstacionesRecorridas;

    public Tren(double valorPorEstacion, int EstacionesRecorridas, String patente, int capacidad, String empresa, String pasajeros) {
        super(patente, capacidad, empresa, pasajeros);
        this.valorPorEstacion = valorPorEstacion;
        this.EstacionesRecorridas = EstacionesRecorridas;
    }

    
  
    

    

    @Override
    public String toString() {
        return "Tren{" + "valorPorEstacion=" + valorPorEstacion + ", EstacionesRecorridas=" + EstacionesRecorridas + '}';
    }
    
     
    @Override
      public double calcularCostoBase(){
          double totalPasajeTren = valorPorEstacion * EstacionesRecorridas; 
          System.out.println("El costo base es: " + totalPasajeTren);
          return totalPasajeTren; 
      }
    
    
}
