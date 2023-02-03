package com.example.demo.controller;

import com.example.demo.models.Destino;
import com.example.demo.service.IViajesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/rest")
public class DestinoController {
    @Autowired
    private IViajesService viajesService;

    @GetMapping("/bring/all/destino")
    public ResponseEntity traerDestinos(){
        return new ResponseEntity(viajesService.obtenerDestinos(), HttpStatus.FOUND);
    }
    @PostMapping("/add/destino")
    public  ResponseEntity agregarDestinos(@RequestBody Destino destino){
        return new ResponseEntity(viajesService.agregarDestino(destino), HttpStatus.CREATED);
    }
}
