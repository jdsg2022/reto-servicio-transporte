package com.example.demo.service;

import com.example.demo.models.Bus;
import com.example.demo.models.Destino;
import com.example.demo.models.Viaje;

import java.util.List;

public interface IViajesService {
    List<Viaje> obtenerViajes ();
    List<Bus> obtenerBuses();
    List<Destino> obtenerDestinos();
    Viaje agregarViaje (Viaje viaje);
    Bus agregarBus (Bus bus);
    Destino agregarDestino(Destino destino);

}
