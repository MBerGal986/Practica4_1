package proyectoColaborativo;

//Interfaz que hereda de MatchDeportivo. Define dos nuevos métodos setter que inicializan la cantidad de goles realizados por cada equipo.
//Incluye duración de los partidos de fútbol.
public interface PartidoFutbol extends MatchDeportivo {
 
 void setGolesEquipoLocal(int marcador);
 void setGolesEquipoVisitante(int marcador);
 int duracionPartidoFutbol = 90;
 
}