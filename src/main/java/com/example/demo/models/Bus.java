package com.example.demo.models;

public class Bus {
    private int idBus;
    private String placa;
    private int capacidadPasajeros;

    public Bus(int idBus, String placa,int capacidadPasajeros) {
        this.idBus = idBus;
        this.placa = placa;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
}
