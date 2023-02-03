package com.example.demo.repository;

import com.example.demo.models.Pasajero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PasajeroRepositorio {
    private List<Pasajero> pasajeros;
    public PasajeroRepositorio (){

        pasajeros = new ArrayList<>(List.of(
                new Pasajero(1,"Carlos Perez", 1010205465),
                new Pasajero(2,"Martha Osorio", 1010103456),
                new Pasajero(4,"Jhon Bermudez", 1013202010),
                new Pasajero(5,"Laura Mercedez", 1013301310),
                new Pasajero(6,"Santiago Giraldo", 1012404210),
                new Pasajero(7,"Juan David Velez", 1011204310)));
    }
    public void agregarPasajero(Pasajero pasajero){
        pasajeros.add(pasajero);
    }
    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    @Override
    public String toString() {
        return "PasajeroRepositorio{" +
                "pasajeros=" + pasajeros +
                '}';
    }
}
