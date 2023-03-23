package proyectoColaborativo;

//Implementa la interfaz PartidoBaloncesto y, a su vez, la de MatchDeportivo al ser la primera una clase hija de la segunda.
public class PartidoBaloncestoLigaACB implements PartidoBaloncesto {
 
 // Declaración de los atributos para los nombres de los equipos y sus canastas.
 String equipoLocal;
 String equipoVisitante;
 int canastasEquipoLocal;
 int canastasEquipoVisitante;
 
 // Tiene como constructor el de la clase Object.
 
 // Serie de métodos getter para devolver el valor de los atributos.
 public String getEquipoLocal () {
     return this.equipoLocal;
 }
 
 public String getEquipoVisitante () {
     return this.equipoVisitante;
 }
 
 public int getCanastasEquipoLocal () {
     return this.canastasEquipoLocal;
 }
 
 public int getCanastasEquipoVisitante () {
     return this.canastasEquipoVisitante;
 }
 
 // Redefine los métodos setter de la interfaz PartidoBaloncesto para inicializar los valores con los parámetros pasados.
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
 public void setCestasEquipoLocal (int marcador){
     this.canastasEquipoLocal = marcador;
 }    
 
 @Override
 public void setCestasEquipoVisitante (int marcador){
     this.canastasEquipoVisitante = marcador;
 }    
 
 // Método para la impresión de los resultados del partido.
 public void imprimirMarcador () {
     System.out.println("Canastas realizadas por el equipo local (" + equipoLocal + "): " + canastasEquipoLocal);
     System.out.println("Canastas realizadas por el equipo visitante (" + equipoVisitante + "): " + canastasEquipoVisitante);
 }
 
}