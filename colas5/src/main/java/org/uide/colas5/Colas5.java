/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uide.colas5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author Danny
 */
public class Colas5 {

    public static void main(String[] args) {
        Banco banco = new Banco();
        int tiempoSimulacion = 20; 
        int numeroCajeros = 2;

     
        banco.simular(tiempoSimulacion, numeroCajeros);
        banco.imprimirEstadisticas();
    }
}



