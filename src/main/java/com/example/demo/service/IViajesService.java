package com.example.demo.service;

import com.example.demo.models.Viaje;

import java.util.List;

public interface IViajesService {
    List<Viaje> obtenerViajes ();
    Viaje agregarViaje (Viaje viaje);
}
