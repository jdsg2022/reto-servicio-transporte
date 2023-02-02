package com.example.demo.controller;

import com.example.demo.models.Viaje;
import com.example.demo.service.IViajesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/rest")
public class STransporteController {
    @Autowired
    private IViajesService viajesService;

    @GetMapping("/bring/all")
    public ResponseEntity traerViajes(){
        return new ResponseEntity(viajesService.obtenerViajes(), HttpStatus.FOUND);
    }
    @PostMapping("/add/tvl")
    public  ResponseEntity agregarViajes(@RequestBody Viaje viaje){
        return new ResponseEntity(viajesService.agregarViaje(viaje), HttpStatus.CREATED);
    }
}
