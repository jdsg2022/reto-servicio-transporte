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

    public String getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(String numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Viaje> getListaViajes() {
        return listaViajes;
    }

    public void setListaViajes(List<Viaje> listaViajes) {
        this.listaViajes = listaViajes;
    }

    public List<Bus> getListaBuses() {
        return listaBuses;
    }

    public void setListaBuses(List<Bus> listaBuses) {
        this.listaBuses = listaBuses;
    }

    public List<Destino> getListaDestinos() {
        return listaDestinos;
    }

    public void setListaDestinos(List<Destino> listaDestinos) {
        this.listaDestinos = listaDestinos;
    }
}
