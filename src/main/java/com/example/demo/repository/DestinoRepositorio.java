package com.example.demo.repository;

import com.example.demo.models.Destino;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class DestinoRepositorio {
    private List<Destino> destinos;
    public DestinoRepositorio (){

        destinos = new ArrayList<>(List.of(new Destino(1,"Cartagena"),
                new Destino(2,"Bucaramanga"),
                new Destino(3,"Amazonas")));
    }
    public void agregarDestino(Destino destino){
        destinos.add(destino);
    }
    public List<Destino> getDestinos() {
        return destinos;
    }

    @Override
    public String toString() {
        return "DestinoRepositorio{" +
                "destinos=" + destinos +
                '}';
    }
}
