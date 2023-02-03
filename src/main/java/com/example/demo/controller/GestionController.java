package com.example.demo.controller;

import com.example.demo.models.Bus;
import com.example.demo.models.Destino;
import com.example.demo.models.Viaje;
import com.example.demo.service.IGestionViajes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/gestion")
public class GestionController {
    @Autowired
    private IGestionViajes iGestionViajes;

    @GetMapping()
    public ResponseEntity obtenerTickets(){
        return new ResponseEntity(iGestionViajes.obtenerTickets(), HttpStatus.FOUND);
    }
    @PostMapping()
    public ResponseEntity registrarViaje(@RequestBody List<Viaje> viajes,
                                         List<Bus> buses,
                                         List<Destino> destinos){
        iGestionViajes.registrarViaje(viajes,buses,destinos);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}