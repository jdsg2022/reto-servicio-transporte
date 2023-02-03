package com.example.demo.service;

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
                viaje.getHorario());
        return viajes;
    }
}
