package com.example.demo.repository;

import com.example.demo.models.Bus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class BusRepositorio {
    private List<Bus> buses;

    public BusRepositorio() {

        buses = new ArrayList<>(List.of(new Bus(1,"AJD 143", 30),
                new Bus(2,"KDH 396", 15),
                new Bus(3,"CMG 963", 20)));
    }

    public void agregarBuses(Bus bus) {
        buses.add(bus);
    }

    public List<Bus> getBuses() {
        return buses;
    }

    @Override
    public String toString() {
        return "BusRepositorio{" +
                "buses=" + buses +
                '}';
    }
}
