package com.example.demo.repository;

import com.example.demo.models.Ticket;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketRepositorio {
    private List<Ticket> tickets;

    public TicketRepositorio() {
        this.tickets = new ArrayList<>();
    }
    public List<Ticket> obtenerTickets(){
        return this.tickets;
    }
    public  void registrarViaje(Ticket ticket){
        tickets.add(ticket);
    }
}
