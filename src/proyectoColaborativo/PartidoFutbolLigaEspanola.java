package proyectoColaborativo;

//Implementa la interfaz PartidoFutbol y, a su vez, la de MatchDeportivo al ser la primera una clase hija de la segunda.
public class PartidoFutbolLigaEspanola implements PartidoFutbol {
 
 // Declaración de los atributos para los nombres de los equipos y sus goles.
 String equipoLocal;
 String equipoVisitante;
 int golesEquipoLocal;
 int golesEquipoVisitante;
 
 // Tiene como constructor el de la clase Object.
 
 // Serie de métodos getter para devolver el valor de cada atributo.
 public String getEquipoLocal () {
     return this.equipoLocal;
 }
 
 public String getEquipoVisitante () {
     return this.equipoVisitante;
 }
 
 public int getGolesEquipoLocal () {
     return this.golesEquipoLocal;
 }
 
 public int getGolesEquipoVisitante () {
     return this.golesEquipoVisitante;
 }
 
 // Redefine los métodos setter de la interfaz PartidoFutbol para inicializar los valores con los parámetros pasados.
 @Override
 public void setEquipoLocal (String nombre) {
     this.equipoLocal = nombre;
 }
 
 @Override
 public void setEquipoVisitante (String nombre) {
     this.equipoVisitante = nombre;
 }
 
 // Redefine los métodos setter de la interfaz MatchDeportivo para inicializar los valores con los parámetros pasados.
 @Override
 public void setGolesEquipoLocal (int marcador){
     this.golesEquipoLocal = marcador;
 }    
 
 @Override
 public void setGolesEquipoVisitante (int marcador){
     this.golesEquipoVisitante = marcador;
 }    
 
 // Método para la impresión de los resultados del partido.
 public void imprimirMarcador () {
     System.out.println("Goles realizados por el equipo local (" + equipoLocal + "): " + golesEquipoLocal);
     System.out.println("Goles realizados por el equipo visitante (" + equipoVisitante + "): " + golesEquipoVisitante);
 }
 
}

