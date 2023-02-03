package com.example.demo.service;

import com.example.demo.models.Bus;
import com.example.demo.models.Destino;
import com.example.demo.models.Viaje;
import com.example.demo.repository.ViajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ViajesService implements IViajesService {
    @Autowired
    private ViajeRepositorio viajeRepositorio;
    @Override
    public List<Viaje> obtenerViajes() {
        return viajeRepositorio.getViajes();
    }

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
    public List<Bus> obtenerBuses() {
        return null;
    }

    @Override
    public List<Destino> obtenerDestinos() {
        return null;
    }

    @Override
    public Bus agregarBus(Bus bus) {
        return null;
    }

    @Override
    public Destino agregarDestino(Destino destino) {
        return null;
    }
}
