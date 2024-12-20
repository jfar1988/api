package com.example.apiRest.Models;

public class DestinoResponse {

    private String destinoA;
    private String destinoE;

    // Constructor
    public DestinoResponse(String destinoA, String destinoE) {
        this.destinoA = destinoA;
        this.destinoE = destinoE;
    }

    // Getters and Setters

    public String getDestinoA() {
        return destinoA;
    }

    public void setDestinoA(String destinoA) {
        this.destinoA = destinoA;
    }

    public String getDestinoE() {
        return destinoE;
    }

    public void setDestinoE(String destinoE) {
        this.destinoE = destinoE;
    }
}
