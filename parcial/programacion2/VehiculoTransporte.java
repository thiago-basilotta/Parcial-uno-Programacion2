/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.programacion2;

import java.util.Set;

/**
 *
 * @author thiag
 */
public abstract class VehiculoTransporte {
    protected String patente;
    protected int capacidad;
    protected String empresa; 
    protected String pasajeros; 

    public VehiculoTransporte(String patente, int capacidad, String empresa, String pasajeros) {
        setPatente(patente);
        setCapacidad(capacidad);
        setEmpresa(empresa);
        setPasajeros(pasajeros); 
        
       
    }
    
    @Override
    public String toString() {
        return "VehiculoTransporte{" + "patente=" + patente + ", capacidad=" + capacidad + ", empresa=" + empresa + '}';
    }
    

    public void setPatente(String patente) {
        if(patente == null || patente.isEmpty()){
            System.out.println("El campo no puede estar vacio");
            return;
        }
            
        this.patente = patente;
    }

    public void setCapacidad(int capacidad) {
        if(capacidad <=0){
            System.out.println("No se puede asignar una capacidad negativa o de cero a los vehiculos");
            return; 
        }
        this.capacidad = capacidad;
    }

    public void setEmpresa(String empresa) {
            if(empresa == null || empresa.isEmpty()){
            System.out.println("El campo no puede estar vacio");
            return;
            }
        this.empresa = empresa;
    }

    public String getPatente() {
        return patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getEmpresa() {
        return empresa;
    } 

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        if(pasajeros == null || pasajeros.isEmpty()){
            System.out.println("este campo no puede estar vacio");
            return;
        }
        this.pasajeros = pasajeros;
    }
    
    
    
    public abstract double calcularCostoBase(); 
}
