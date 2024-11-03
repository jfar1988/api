package com.example.apiRest.Controllers;

import com.example.apiRest.Models.DestinoRequest;
import com.example.apiRest.Models.DestinoResponse;
import com.example.apiRest.Services.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DestinoController {

    private final DestinoService destinoService;

    @Autowired
    public DestinoController(DestinoService destinoService) {
        this.destinoService = destinoService;
    }

    @PostMapping("/enviarDestino")
    public DestinoResponse enviarDestino(@RequestBody DestinoRequest destinoRequest) {

        return destinoService.enviarDestino(
                destinoRequest.getpDestino(),
                destinoRequest.getpClimatica(),
                destinoRequest.getpActividad(),
                destinoRequest.getpAlojamiento(),
                destinoRequest.getdViaje(),
                destinoRequest.getEdad()
        );
    }
}
