package com.example.demo.models;

import java.time.LocalTime;

public class Viaje {
    private LocalTime horario;
    private String destino;
    private int cantidadPasajeros;

    public Viaje(String destino, int cantidadPasajeros) {
        this.destino = destino;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "destino='" + destino + '\'' +
                ", cantidadPasajeros=" + cantidadPasajeros +
                '}';
    }
}
