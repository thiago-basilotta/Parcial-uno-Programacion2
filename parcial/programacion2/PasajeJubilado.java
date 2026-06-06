/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.programacion2;

/**
 *
 * @author thiag
 */
public class PasajeJubilado implements Pasaje {
    
    
@Override
public void calcularCostoFinal(double CostoBase){
    double CostoJubilado = CostoBase * 25 / 100; 
    System.out.println("Valor del pasaje para jubilados:  " + CostoJubilado);
   
}

}
