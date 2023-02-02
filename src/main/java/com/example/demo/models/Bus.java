package com.example.demo.models;

public class Bus {
    private int numeroBus;
    private int capacidadPasajeros;

    public Bus() {
    }

    public Bus(int numeroBus, int capacidadPasajeros) {
        this.numeroBus = numeroBus;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getNumeroBus() {
        return numeroBus;
    }

    public void setNumeroBus(int numeroBus) {
        this.numeroBus = numeroBus;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
}
