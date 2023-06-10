/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.colas5;

/**
 *
 * @author Danny
 */
class Cliente {
    private int id;
    private int tiempoLlegada;

    public Cliente(int id) {
        this.id = id;
        this.tiempoLlegada = -1; 
    }

    public int getId() {
        return id;
    }

    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(int tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }
}
