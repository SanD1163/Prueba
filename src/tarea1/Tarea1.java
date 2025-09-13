/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.Scanner;

/**
 *
 * @author mojit
 */
public class Tarea1 {
    
    public static void main(String[] args) {
        
        Scanner obj_scaner=new Scanner(System.in);
        
        int numPacientes;
        double temp;
        double saturacion; 
        int lpm;
        
        int rojo;
        int amarillo;
        int verde;
        
        double sumSatura;
        double promSatura;
        
        double maxTemp;
        double minSatura;
        
        rojo = 0;
        amarillo = 0;
        verde = 0;
        sumSatura = 0;
        maxTemp = Integer.MIN_VALUE;
        minSatura = Integer.MAX_VALUE;
                
        System.out.println("Ingrese el número de pacientes: ");
        numPacientes = obj_scaner.nextInt();
        
        if(numPacientes < 0){
            System.out.println("El número tiene que ser mayor a 0");
        }
        else{
            for(int i = 1; i <= numPacientes; i++){
                
                System.out.println("Datos del paciente " +i +":");
                
                System.out.println("Saturacion (%): ");
                saturacion = obj_scaner.nextDouble();
                System.out.println("Temperatura (°C): ");
                temp = obj_scaner.nextDouble();
                System.out.println("Frecuencia cardiaca (lpm): ");
                lpm = obj_scaner.nextInt();
                
                if(saturacion < 90 || temp >= 39 || lpm >= 130 || lpm <= 40){
                    System.out.println("---->Emergencia");
                    rojo++;
                }
                else {
                    if((90 <= saturacion && saturacion <= 93) || (38 <= temp && temp <= 38.9) || (100 <= lpm && lpm <= 129)){
                        System.out.println("---->Prioritario");
                        amarillo++;
                    }
                    else{
                        System.out.println("---->No urgente");
                        verde++; 
                    }
                  
                }

                if(temp > maxTemp){
                    maxTemp = temp;
                }
                
                if(saturacion < minSatura){
                    minSatura = saturacion;
                }
                
                sumSatura = sumSatura + saturacion;
            }
            
            promSatura = sumSatura / numPacientes;
            
            System.out.println("Resumen final__________");
            
            System.out.println("Pacientes en emergencia: " +rojo);
            System.out.println("Pacientes en prioritario: " +amarillo);
            System.out.println("Pacientes no urgentes: " +verde);
            
            System.out.println("Saturación promedio: " +promSatura);
            
            System.out.println("Temperatura máxima:  " +maxTemp);
            System.out.println("Saturación mínima:  " +minSatura);
        }
        
        System.out.println("Hola a todos 123");
        obj_scaner.close();
        
    } 
}
