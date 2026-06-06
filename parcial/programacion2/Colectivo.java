/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.programacion2;

/**
 *
 * @author thiag
 */
public class Colectivo extends VehiculoTransporte {
    protected double valorPorCuadra;
    protected int CuadrasRecorridas;

    public Colectivo(double valorPorCuadra, int CuadrasRecorridas, String patente, int capacidad, String empresa, String pasajeros) {
        super(patente, capacidad, empresa, pasajeros);
        this.valorPorCuadra = valorPorCuadra;
        this.CuadrasRecorridas = CuadrasRecorridas;
    }



    @Override
    public String toString() {
        return "Colectivo{" + "valorPorCuadra=" + valorPorCuadra + ", CuadrasRecorridas=" + CuadrasRecorridas + '}';
    }
    
    @Override
      public double calcularCostoBase(){
          double totalPasajeColectivo = valorPorCuadra * CuadrasRecorridas; 
          System.out.println("El costo base es: " + totalPasajeColectivo);
          return totalPasajeColectivo; 
      }
      
}
