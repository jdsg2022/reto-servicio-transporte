package com.example.demo.service;

import com.example.demo.models.Viaje;
import com.example.demo.repository.ServicioTransportes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class ViajesService implements IViajesService {
    @Autowired
    private ServicioTransportes servicioTransportes;
    @Override
    public List<Viaje> obtenerViajes() {
        return servicioTransportes.getViajes();
    }

    @Override
    public Viaje agregarViaje(Viaje viaje) {
        Viaje viajes = new Viaje(viaje.getDestino(),
                           viaje.getCantidadPasajeros());
        return viajes;
    }
}
