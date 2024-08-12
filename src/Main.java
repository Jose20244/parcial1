public class Main {
    public static void main(String[] args) {
        SistemaGestionEventos sistema = new SistemaGestionEventos();

        evento maraton = new evento("maraton","Carrera 10k", "agosto", "octubre");
        sistema.registrarevento(maraton);

        Participante juan = new Participante("Juan", "P001");
        sistema.registrarParticipante(juan);

        sistema.asignarParticipanteAEvento("P001", "Maratón");

        sistema.imprimirEventos();
        sistema.imprimirParticipantes();
    }
}
