package com.example.apiRest.Controllers;



import com.example.apiRest.Models.DestinoRequest;
import com.example.apiRest.Services.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DestinoController {

    private final DestinoService destinoService;

    @Autowired
    public DestinoController(DestinoService destinoService) {
        this.destinoService = destinoService;
    }

    @PostMapping("/volverAtras")
    public void volverAtras() {
        destinoService.volverAtras();
    }

    @PostMapping("/enviarDestino")
    public ResponseEntity<List <DestinoRequest>> enviarDestino() {
        List<DestinoRequest> respuestas = destinoService.enviarDestino();
        return ResponseEntity.ok(respuestas);
    }

    @GetMapping("/resultados")
    public String[] getResultados() {
        return new String[]{destinoService.destinoA, destinoService.destinoE};
    }
}
