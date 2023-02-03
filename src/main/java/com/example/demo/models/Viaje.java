package com.example.demo.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Viaje {
    private int idViaje;
    private LocalDate fecha;
    private LocalTime horario;
    private List<Pasajero> pasajeros;

    public Viaje(int idViaje, LocalDate fecha, LocalTime horario, List<Pasajero> pasajeros) {
        this.idViaje = idViaje;
        this.fecha = fecha;
        this.horario = horario;
        this.pasajeros = pasajeros;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
}
