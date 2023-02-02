package com.example.demo.repository;

import com.example.demo.models.Bus;
import com.example.demo.models.Viaje;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ServicioTransportes {
    private final String nombre;
    private int cantidadViajes;
    private List<Viaje> viajes;
    private List<Bus> buses;
    public ServicioTransportes(int cantidadViajes) {
        this.nombre = "Transportes Medellín";
        this.cantidadViajes = cantidadViajes;
        viajes = new ArrayList<>(List.of());
        buses = new ArrayList<>(List.of());
    }
    public void agregarViaje(){

    }
    public List<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }

    public int getCantidadViajes() {
        return cantidadViajes;
    }

    public void setCantidadViajes(int cantidadViajes) {
        this.cantidadViajes = cantidadViajes;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

    @Override
    public String toString() {
        return "ServicioTransportes{" +
                "nombre='" + nombre + '\'' +
                ", cantidadViajes=" + cantidadViajes +
                ", viajes=" + viajes +
                ", buses=" + buses +
                '}';
    }
}
