package com.example.demo.models;

public class Destino {
    private int idDestino;
    private String lugar;

    public Destino(int idDestino, String lugar) {
        this.idDestino = idDestino;
        this.lugar = lugar;
    }

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
