package com.example.apiRest.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DestinoRequest {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String pDestino;
        private String pClimatica;
        private String pActividad;
        private String pAlojamiento;
        private String dViaje;
        private String edad;

        public DestinoRequest(String pDestino, String pClimatica, String pActividad, String pAlojamiento, String dViaje, String edad) {
                this.pDestino = pDestino;
                this.pClimatica = pClimatica;
                this.pActividad = pActividad;
                this.pAlojamiento = pAlojamiento;
                this.dViaje = dViaje;
                this.edad = edad;
        }

        public DestinoRequest() {

        }


        public String getpDestino() {
                return pDestino;
        }

        public void setpDestino(String pDestino) {
                this.pDestino = pDestino;
        }

        public String getpClimatica() {
                return pClimatica;
        }

        public void setpClimatica(String pClimatica) {
                this.pClimatica = pClimatica;
        }

        public String getpActividad() {
                return pActividad;
        }

        public void setpActividad(String pActividad) {
                this.pActividad = pActividad;
        }

        public String getpAlojamiento() {
                return pAlojamiento;
        }

        public void setpAlojamiento(String pAlojamiento) {
                this.pAlojamiento = pAlojamiento;
        }

        public String getdViaje() {
                return dViaje;
        }

        public void setdViaje(String dViaje) {
                this.dViaje = dViaje;
        }

        public String getEdad() {
                return edad;
        }

        public void setEdad(String edad) {
                this.edad = edad;
        }
}
