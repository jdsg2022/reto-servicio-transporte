package com.example.demo.repository;

import com.example.demo.models.Bus;
import com.example.demo.models.Viaje;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ViajeRepositorio {
    private List<Viaje> viajes;
    public ViajeRepositorio (){

        viajes = new ArrayList<>(List.of(
                new Viaje(1,
                        LocalDate.of(2023,2,15),
                        LocalTime.of(12,15))));
    }
    public void agregarViaje(Viaje viaje){
        viajes.add(viaje);
    }
    public List<Viaje> getViajes() {
        return viajes;
    }

    @Override
    public String toString() {
        return "ViajeRepositorio{" +
                "viajes=" + viajes +
                '}';
    }
}
