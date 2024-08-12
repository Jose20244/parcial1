import java.util.LinkedHashMap;
import java.util.Map;

class Resultado {
    private evento evento;
    private Participante ganador;
    private Map<Participante, Integer> posiciones;

    public Resultado(evento evento) {
        this.evento = evento;
        this.posiciones = new LinkedHashMap<>();
    }

}

