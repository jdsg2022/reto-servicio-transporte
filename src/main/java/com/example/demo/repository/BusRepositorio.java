package com.example.demo.repository;

import com.example.demo.models.Bus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class BusRepositorio {
    private List<Bus> buses;

    public BusRepositorio() {

        buses = new ArrayList<>();
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
