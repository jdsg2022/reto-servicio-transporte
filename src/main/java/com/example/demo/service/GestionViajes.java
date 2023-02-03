package com.example.demo.service;

import com.example.demo.models.Bus;
import com.example.demo.models.Destino;
import com.example.demo.models.Ticket;
import com.example.demo.models.Viaje;
import com.example.demo.repository.BusRepositorio;
import com.example.demo.repository.TicketRepositorio;
import com.example.demo.repository.ViajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class GestionViajes implements IGestionViajes{
    @Autowired
    private TicketRepositorio ticketRepositorio;
    @Autowired
    private ViajeRepositorio viajeRepositorio;
    @Autowired
    private BusRepositorio busRepositorio;

    @Override
    public void registrarViaje(List<Viaje> viajesRealizados,
                               List<Bus> busesAsignados,
                               List<Destino> destinosAsignados) {
        Ticket nuevoTicket = new Ticket(UUID.randomUUID().toString(), new Date().toString());
        nuevoTicket.setListaBuses(busesAsignados);
        busesAsignados.stream().forEach(bus -> {
            busRepositorio.busesDisponibles(bus.getIdBus());
        });
        nuevoTicket.setListaViajes(viajesRealizados);
        nuevoTicket.setListaDestinos(destinosAsignados);
        ticketRepositorio.registrarViaje(nuevoTicket);
    }

    @Override
    public List<Ticket> obtenerTickets() {
        return ticketRepositorio.obtenerTickets();
    }
}
