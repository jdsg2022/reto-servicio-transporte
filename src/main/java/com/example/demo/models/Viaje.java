package com.example.demo.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
    private String destino;
    private int cantidadPasajeros;
    List<Bus> buses;

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
