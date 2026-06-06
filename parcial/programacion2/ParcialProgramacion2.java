/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial.programacion2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thiag
 */
public class ParcialProgramacion2 {

    public static void main(String[] args) {
        ArrayList<VehiculoTransporte>vehiculos = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);
        int opcion = 0; 
        
        do{
            System.out.println("=== MENÚ ===");
            System.out.println("1. Registrar viaje");
            System.out.println("2. Mostrar todos los viajes realizados");
            System.out.println("3. Ordenar viajes por costo");
            System.out.println("4. Ordenar viajes por nombre de pasajero");
            System.out.println("5. Mostrar total recaudado");
            System.out.println("6. Salir");
            
             opcion = scanner.nextInt();
              scanner.nextLine(); 
              
              switch(opcion){
                  case 1:
                      System.out.println("Tipo: 1. Colectivo. 2.Tren. 3. Subte");
                      int tipo = scanner.nextInt();
                      scanner.nextLine(); 
                      System.out.println("Patente: ");
                      String patente = scanner.nextLine();
                      System.out.println("Capacidad: ");
                      int capacidad = scanner.nextInt();
                      scanner.nextLine();
                      System.out.println("Empresa: ");
                      String empresa = scanner.nextLine();
                      
                      
                      if(tipo == 1){
                          System.out.println("Valor por cuadra: ");
                          double valorcuadra = scanner.nextDouble();
                          System.out.println("Cuadras recorridas: ");
                          int cuadraRecorrida = scanner.nextInt();
                          System.out.println("Tipo de pasajeros: ");
                          String PasajerosNombre = scanner.nextLine();
                          vehiculos.add(new Colectivo(valorcuadra, cuadraRecorrida, patente, capacidad, empresa, PasajerosNombre));
                      }
                      
                       if(tipo == 2){
                        System.out.println("valor por estacion: ");
                        double valorestacion = scanner.nextDouble();
                           System.out.println("Cantidad de estaciones recorridas: ");
                        int estacionesRecorridas = scanner.nextInt(); 
                          System.out.println("Tipo de pasajeros: ");
                          String PasajerosNombre = scanner.nextLine();
                        vehiculos.add(new Tren(valorestacion, estacionesRecorridas, patente, capacidad, empresa, PasajerosNombre)); 
                       }
                       
                    if(tipo == 3){
                        System.out.println("Valor por pasajero: ");
                        double valorPasajero = scanner.nextDouble();
                        System.out.println("Cantidad de pasajeros: ");
                        int cantPasajero = scanner.nextInt();
                          System.out.println("Tipo de pasajeros: ");
                          String PasajerosNombre = scanner.nextLine();
                        vehiculos.add(new Subte(valorPasajero, cantPasajero, patente, capacidad, empresa, PasajerosNombre));
                    }
                    break; 
                    
                  case 2: 
                        for(int p = 0; p < vehiculos.size(); p++){
                    System.out.println(vehiculos.get(p));
                }
                     break;
                     
               
                  case 3: 
                      break;
                  
                  case 4: 
                         for(int p = 0; p < vehiculos.size(); p++){
                             if(vehiculos.get(p).getPasajeros().equals(pasajerosBsuca)){
                                 System.out.println(vehiculos.get(p));
                             }
                }
                      
                      
              }
            
        }while(opcion != 6); 
    }
}
