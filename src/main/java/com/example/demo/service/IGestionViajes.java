package com.example.demo.service;

import com.example.demo.models.Bus;
import com.example.demo.models.Destino;
import com.example.demo.models.Ticket;
import com.example.demo.models.Viaje;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IGestionViajes {
    void registrarViaje(List<Viaje> viajesRealizados,
                        List<Bus> busesAsignados,
                        List<Destino> destinosAsignados);
    List<Ticket> obtenerTickets();

}
