package proyectoColaborativo;

//Interfaz que hereda de MatchDeportivo. Define dos nuevos métodos setter que inicializan la cantidad de cestas realizadas por cada equipo.
//Incluye duración de los partidos de baloncesto.
public interface PartidoBaloncesto extends MatchDeportivo {
 
 void setCestasEquipoLocal(int marcador);
 void setCestasEquipoVisitante(int marcador);
 int duracionPartidoBaloncesto = 40;
 
}