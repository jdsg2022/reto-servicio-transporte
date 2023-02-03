package com.example.demo.models;

public class Bus {
    private String idBus;
    private String marca;
    private int cantidadBuses;

    public Bus(String idBus, String marca, int cantidadBuses) {
        this.idBus = idBus;
        this.marca = marca;
        this.cantidadBuses = cantidadBuses;
    }
    public void busesDisponibles(){
        this.cantidadBuses --;
    }

    public String getIdBus() {
        return idBus;
    }

    public void setIdBus(String idBus) {
        this.idBus = idBus;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadBuses() {
        return cantidadBuses;
    }

    public void setCantidadBuses(int cantidadBuses) {
        this.cantidadBuses = cantidadBuses;
    }
}
