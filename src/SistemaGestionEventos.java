import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class SistemaGestionEventos {
    private List<evento> eventos;
    private List<Participante> participantes;

    public SistemaGestionEventos() {

    }
    public void registrarEvento(evento evento) {
        eventos.add(evento);
    }

    public void registrarParticipante(Participante participante) {
        participantes.put(participante.getId(), participante);
    }

    public void asignarParticipanteAEvento(String idParticipante, String nombreEvento) {
        Participante participante = participantes.get(idParticipante);
        for (evento evento : eventos) {
            if (evento.getNombre().equals(nombreEvento)) {
                evento.agregarParticipante(participante);
                participante.registrarEvento(evento);
                return;
            }
        }
    }

    public void imprimirEventos() {
        for (evento evento : eventos) {
            System.out.println(evento);
        }
    }

    public void imprimirParticipantes() {
        for (Participante participante : participantes.values()) {
            System.out.println(participante);
        }
    }

    public void registrarevento(evento maraton) {
    }
}
