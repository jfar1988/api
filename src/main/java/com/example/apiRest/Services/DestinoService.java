package com.example.apiRest.Services;
import com.example.apiRest.Models.DestinoRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DestinoService {


    public String destinoA = "";
    public String destinoE = "";



    public DestinoRequest enviarDestino(String pDestino, String pClimatica, String pActividad, String pAlojamiento, String dViaje, String edad) {
       DestinoRequest.setpDestino(pDestino);

        return DestinoRequest;

        // Reseteamos destinos antes de procesar
        destinoA = "";
        destinoE = "";

        // Lógica principal
        switch (pDestino) {
            case "Playa":
                if ("Caluroso".equals(pClimatica)) {
                    switch (dViaje) {
                        case "1-2 semanas":
                            if ("Menos de 30 años".equals(edad) && "Deportes y Aventuras".equals(pActividad) && "Hostal o Albergue".equals(pAlojamiento)) {
                                destinoA = "Tulum";
                                destinoE = "Ibiza";
                            } else if ("Menos de 30 años".equals(edad) && "Relax y Bienestar".equals(pActividad) && "Hotel de Lujo".equals(pAlojamiento)) {
                                destinoA = "Playa del Carmen";
                                destinoE = "Santorini";
                            } else if ("30-50 años".equals(edad) && "Cultura y Museos".equals(pActividad) && "Hotel de Lujo".equals(pAlojamiento)) {
                                destinoA = "Honolulu";
                                destinoE = "Malta";
                            }
                            break;
                        case "Menos de una semana":
                            if ("Menos de 30 años".equals(edad) && "Cultura y Museos".equals(pActividad) && "Airbnb".equals(pAlojamiento)) {
                                destinoA = "Cartagena";
                                destinoE = "Barcelona";
                            }
                            break;
                    }
                } else if ("Templado".equals(pClimatica)) {
                    switch (dViaje) {
                        case "1-2 semanas":
                            if ("Menos de 30 años".equals(edad) && "Cultura y Museos".equals(pActividad) && "Hostal o Albergue".equals(pAlojamiento)) {
                                destinoA = "San Juan";
                                destinoE = "Niza";
                            } else if ("30-50 años".equals(edad) && "Cultura y Museos".equals(pActividad) && "Hotel de Lujo".equals(pAlojamiento)) {
                                destinoA = "Río de Janeiro";
                                destinoE = "Lisboa";
                            }
                            break;
                        case "Más de dos semanas":
                            if ("Más de 50 años".equals(edad) && "Relax y Bienestar".equals(pActividad) && "Airbnb".equals(pAlojamiento)) {
                                destinoA = "Punta Cana";
                                destinoE = "Algarve";
                            }
                            break;
                    }
                }
                break;

            case "Montaña":
                if ("Frío".equals(pClimatica) && "1-2 semanas".equals(dViaje)) {
                    if ("Más de 50 años".equals(edad) && "Airbnb".equals(pAlojamiento)) {
                        if ("Cultura y Museos".equals(pActividad)) {
                            destinoA = "Ushuaia";
                            destinoE = "Reykjavik";
                        } else if ("Relax y Bienestar".equals(pActividad)) {
                            destinoA = "Aspen";
                            destinoE = "Innsbruck";
                        }
                    } else if ("Menos de 30 años".equals(edad) && "Hostal o Albergue".equals(pAlojamiento) && "Deportes y Aventuras".equals(pActividad)) {
                        destinoA = "Bariloche";
                        destinoE = "Interlaken";
                    } else if ("30-50 años".equals(edad) && "Hotel de Lujo".equals(pAlojamiento) && "Deportes y Aventuras".equals(pActividad)) {
                        destinoA = "Banff";
                        destinoE = "Zermatt";
                    }
                } else if ("Templado".equals(pClimatica) && "1-2 semanas".equals(dViaje)) {
                    if ("Más de 50 años".equals(edad) && "Airbnb".equals(pAlojamiento) && "Cultura y Museos".equals(pActividad)) {
                        destinoA = "Cusco";
                        destinoE = "Granada";
                    } else if ("Menos de 30 años".equals(edad) && "Airbnb".equals(pAlojamiento) && "Deportes y Aventuras".equals(pActividad) && "Más de dos semanas".equals(dViaje)) {
                        destinoA = "Machu Picchu";
                        destinoE = "Chamonix";
                    }
                }
                break;

            case "Ciudad":
                if ("Caluroso".equals(pClimatica) && "1-2 semanas".equals(dViaje) && "Más de 50 años".equals(edad) && "Hotel de Lujo".equals(pAlojamiento) && "Cultura y Museos".equals(pActividad)) {
                    destinoA = "Los Angeles";
                    destinoE = "Roma";
                } else if ("Frío".equals(pClimatica) && "1-2 semanas".equals(dViaje) && "30-50 años".equals(edad) && "Hotel de Lujo".equals(pAlojamiento) && "Cultura y Museos".equals(pActividad)) {
                    destinoA = "Toronto";
                    destinoE = "Berlín";
                } else if ("Templado".equals(pClimatica) && "1-2 semanas".equals(dViaje) && "Cultura y Museos".equals(pActividad)) {
                    if ("30-50 años".equals(edad) && "Hostal o Albergue".equals(pAlojamiento)) {
                        destinoA = "Ciudad de México";
                        destinoE = "Madrid";
                    } else if ("Más de 50 años".equals(edad) && "Hotel de Lujo".equals(pAlojamiento)) {
                        destinoA = "Nueva York";
                        destinoE = "París";
                    }
                } else if ("Templado".equals(pClimatica) && "Menos de una semana".equals(dViaje)) {
                    if ("Menos de 30 años".equals(edad) && "Airbnb".equals(pAlojamiento) && "Relax y Bienestar".equals(pActividad)) {
                        destinoA = "Miami";
                        destinoE = "Viena";
                    } else if ("30-50 años".equals(edad) && "Hotel de Lujo".equals(pAlojamiento) && "Deportes y Aventuras".equals(pActividad)) {
                        destinoA = "Chicago";
                        destinoE = "Londres";
                    }
                }
                break;
        }

        // Si no se ha asignado ningún destino, sugerimos alternativas predeterminadas
        if (destinoA.isEmpty()) {
            destinoA = "Bora Bora";
            destinoE = "Dubái";
        }
    }
}
