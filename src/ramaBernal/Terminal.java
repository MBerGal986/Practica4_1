package ramaBernal;

public class Terminal {
	
	private String numero;
	private int tiempoConversacion;
	
	public Terminal (String num) {
		this.numero = num;
		this.tiempoConversacion = 0;
	}
	
	@Override
	public String toString() {
		return "Nº " + numero + " - " + this.tiempoConversacion + "s de conversación ";
	}
	
	public void llama(Terminal t, int tiempoLlamada) {
		this.tiempoConversacion += tiempoLlamada;
		t.tiempoConversacion += tiempoLlamada;
		}
	
}
