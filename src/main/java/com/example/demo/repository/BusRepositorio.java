package com.example.demo.repository;

import com.example.demo.models.Bus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BusRepositorio {
    private List<Bus> buses;

    public BusRepositorio() {

        buses = new ArrayList<>(List.of(new Bus("11","CHEVROLET", 30),
                new Bus("12","MERCEDEZ", 15),
                new Bus("13","KIA", 20)));
    }

    public void agregarBuses(Bus bus) {
        buses.add(bus);
    }

    public List<Bus> getBuses() {
        return buses;
    }
    public void busesDisponibles(String id){
        List<Bus> disponibles = buses.stream().map(bus ->{
            if (bus.getIdBus().equals(id)){
                bus.busesDisponibles();
                return bus;
            }
            return bus;
        }).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "BusRepositorio{" +
                "buses=" + buses +
                '}';
    }
}
