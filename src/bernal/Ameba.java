package bernal;

public class Ameba {
	
	private int peso;
	
	public Ameba () {
		this.peso = 3;
	}
	
	public void come (int comida) {
		this.peso += comida - 1;
	}
	
	public void come (Ameba otraAmeba) {
		this.peso += otraAmeba.peso - 1;
		otraAmeba.peso = 0;
	}
	
	@Override
	public String toString() {
		return "Soy una ameba y peso " + peso + " microgramos. ¡Viva!";
	}

}
