package com.example.demo.service;

import com.example.demo.models.Bus;
import com.example.demo.models.Destino;
import com.example.demo.models.Viaje;
import com.example.demo.repository.BusRepositorio;
import com.example.demo.repository.DestinoRepositorio;
import com.example.demo.repository.ViajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ViajesService implements IViajesService {
    @Autowired
    private ViajeRepositorio viajeRepositorio;
    @Autowired
    private BusRepositorio busRepositorio;
    @Autowired
    private DestinoRepositorio destinoRepositorio;

    @Override
    public Viaje agregarViaje(Viaje viaje) {
        Viaje viajes = new Viaje(
                viaje.getIdViaje(),
                viaje.getFecha(),
                viaje.getHorario(),
        viaje.getPasajeros());
        return viajes;
    }
    @Override
    public Bus agregarBus(Bus bus) {
        Bus buses = new Bus(bus.getIdBus(),
                bus.getMarca(),
                bus.getCantidadBuses());
        return buses;
    }

    @Override
    public Destino agregarDestino(Destino destino) {
        Destino destinos = new Destino(destino.getIdDestino(),
                destino.getLugar());
        return destinos;
    }
    @Override
    public List<Viaje> obtenerViajes() {
        return viajeRepositorio.getViajes();
    }

    @Override
    public List<Bus> obtenerBuses() {
        return busRepositorio.getBuses();
    }

    @Override
    public List<Destino> obtenerDestinos() {
        return destinoRepositorio.getDestinos();
    }
}
