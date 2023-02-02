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

        viajes = new ArrayList<>(List.of(new Viaje("Bucaramanga", 12),
                new Viaje("Bogotá", 25),
                new Viaje("Cúcuta", 20)));

        buses = new ArrayList<>(List.of(new Bus(1,30),
                new Bus(2,30),
                new Bus(3, 30)));
    }
    public void agregarViaje(Viaje viaje){
        viajes.add(viaje);
    }
    public List<Viaje> getViajes() {
        return viajes;
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
