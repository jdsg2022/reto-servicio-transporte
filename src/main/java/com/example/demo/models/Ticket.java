package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private String numeroTicket;
    private String date;
    private List<Viaje> listaViajes;
    private List<Bus> listaBuses;
    private List<Destino> listaDestinos;

    public Ticket (String numeroTicket, String date){
        this.numeroTicket = numeroTicket;
        this.date = date;
        this.listaViajes = new ArrayList<>();
        this.listaBuses = new ArrayList<>();
        this.listaDestinos = new ArrayList<>();
    }
}
