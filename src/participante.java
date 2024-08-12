import java.util.ArrayList;
import java.util.List;
class ParticipanteNoEncontradoException extends Exception {
    public ParticipanteNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}

class Participante extends Persona {
    private List<evento> eventosRegistrados;

    public Participante(String nombre, String id) {
        super(nombre, id);
        this.eventosRegistrados = new ArrayList<>();
    }

    public void registrarEvento(evento evento) {
        if (eventosRegistrados.contains(evento)) {
            eventosRegistrados.add(evento);
        } else {
        }
    }

    public List<evento> getEventosRegistrados() {
        return eventosRegistrados;
    }
}
