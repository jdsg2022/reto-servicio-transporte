package com.example.demo.controller;

import com.example.demo.models.Bus;
import com.example.demo.service.IViajesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/rest")
public class BusController {
    @Autowired
    private IViajesService viajesService;

    @GetMapping("/bring/bus")
    public ResponseEntity traerBuses(){
        return new ResponseEntity(viajesService.obtenerBuses(), HttpStatus.FOUND);
    }
    @PostMapping("/add/bus")
    public  ResponseEntity agregarBuses(@RequestBody Bus bus){
        return new ResponseEntity(viajesService.agregarBus(bus), HttpStatus.CREATED);
    }
}