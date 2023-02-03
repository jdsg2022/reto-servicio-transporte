package com.example.demo.models;

public class Pasajero {
    private int idPasajero;
    private String nombre;
    private int cedula;

    public Pasajero(int idPasajero, String nombre, int cedula) {
        this.idPasajero = idPasajero;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "idPasajero=" + idPasajero +
                ", nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                '}';
    }
}
