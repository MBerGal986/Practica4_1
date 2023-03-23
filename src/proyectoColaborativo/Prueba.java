package proyectoColaborativo;

public class Prueba {

    // Método de prueba.
    public static void main(String args[]) {
        // Crea objeto del tipo PartidoFutbolLigaEspanola y prueba sus métodos.
        PartidoFutbolLigaEspanola partido = new PartidoFutbolLigaEspanola();
        System.out.println("Duracion del partido = " + PartidoFutbolLigaEspanola.duracionPartidoFutbol);
        partido.setEquipoLocal("Sevilla FC");
        partido.setEquipoVisitante("Real Betis");
        partido.setGolesEquipoLocal(6);
        partido.setGolesEquipoVisitante(0);
        partido.imprimirMarcador();
        
        System.out.println();
        
        // Crea objeto del tipo PartidoBaloncestoLigaACB y prueba sus métodos.
        PartidoBaloncestoLigaACB partido2 = new PartidoBaloncestoLigaACB();
        System.out.println("Duracion del partido = " + PartidoBaloncestoLigaACB.duracionPartidoBaloncesto);
        partido2.setEquipoLocal("Chicago Bulls");
        partido2.setEquipoVisitante("YoRHa");
        partido2.setCestasEquipoLocal(23);
        partido2.setCestasEquipoVisitante(77);
        partido2.imprimirMarcador();
        
        System.out.println();
        
        // Prueba de métodos getters.
        System.out.println("***PRUEBA DE GETTERS***");
        System.out.println("**Partido 1**");
        String nombreLocal;
        String nombreVisitante;
        nombreLocal = partido.getEquipoLocal();
        System.out.println("Equipo local: " + nombreLocal);
        nombreVisitante = partido.getEquipoVisitante();
        System.out.println("Equipo visitante: " + nombreVisitante);
        System.out.println("**Partido 2**");
        nombreLocal = partido2.getEquipoLocal();
        System.out.println("Equipo local: " + nombreLocal);
        nombreVisitante = partido2.getEquipoVisitante();
        System.out.println("Equipo visitante: " + nombreVisitante);
 
    }
}
