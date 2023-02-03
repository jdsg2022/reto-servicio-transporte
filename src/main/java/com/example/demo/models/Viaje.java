package com.example.demo.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Viaje {
    private int idViaje;
    private LocalDate fecha;
    private LocalTime horario;

    public Viaje(int idViaje, LocalDate fecha, LocalTime horario) {
        this.idViaje = idViaje;
        this.fecha = fecha;
        this.horario = horario;
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
}
