/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.colas5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author Danny
 */
class Banco {
    private Queue<Cliente> colaClientes;
    private int clientesTotales;
    private int clientesAtendidos;
    private int tiempoEsperaTotal;

    public Banco() {
        colaClientes = new LinkedList<>();
        clientesTotales = 0;
        clientesAtendidos = 0;
        tiempoEsperaTotal = 0;
    }

    public void simular(int tiempoSimulacion, int numeroCajeros) {
        Random random = new Random();
        int tiempoActual = 0;

        while (tiempoActual < tiempoSimulacion) {
           
            int clientesNuevos = random.nextInt(4); 

            for (int i = 0; i < clientesNuevos; i++) {
                Cliente cliente = new Cliente(clientesTotales++);
                colaClientes.add(cliente);
                System.out.println("Cliente " + cliente.getId() + " ha llegado al banco.");
            }

            
            int clientesAtendidosEnEsteIntervalo = 0;

            while (clientesAtendidosEnEsteIntervalo < numeroCajeros && !colaClientes.isEmpty()) {
                Cliente clienteActual = colaClientes.poll();
                clientesAtendidos++;
                clientesAtendidosEnEsteIntervalo++;
                tiempoEsperaTotal += tiempoActual - clienteActual.getTiempoLlegada();

                // Simular tiempo de atención al cliente
                int tiempoAtencion = random.nextInt(5) + 1; 

                System.out.println("Cajero atendiendo al cliente " + clienteActual.getId() +
                        " por " + tiempoAtencion + " tiempo.");
            }

            tiempoActual++; 
        }
    }

    public void imprimirEstadisticas() {
        System.out.println("Simulación completada.");
        System.out.println("Total de clientes que fueron atendidos: " + clientesAtendidos);
        System.out.println("Tiempo promedio de espera por parte de los cliente: " +
                (double) tiempoEsperaTotal / clientesAtendidos);
    }
}
