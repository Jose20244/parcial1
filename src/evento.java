import java.util.Date;
import java.util.HashMap;
import java.util.Map;
class EventoNoEncontradoException extends Exception {
    public EventoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}

class evento {
    private String nombre;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private Map<String, Participante> participantes;

    public evento(String nombre, String descripcion, String fechaInicio, String fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.participantes = new HashMap<>();
    }

    public void agregarParticipante(Participante participante) {
        if (!participantes.containsKey(participante.getId())) {
            participantes.put(participante.getId(), participante);
        } else {
        }
    }

}
