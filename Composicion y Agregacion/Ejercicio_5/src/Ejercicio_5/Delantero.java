package Ejercicio_5;

public class Delantero extends Jugador{
	
	private String habilidad_especial;
	
	public Delantero(String nombrex, int numerox, String posicionx, String habilida_especialx) {
		super(nombrex, numerox, posicionx);
		this.habilidad_especial=habilida_especialx;	
	}
	
	public String getHabilidad_especial() {
		return habilidad_especial;
	}

	public void setHabilidad_especial(String habilidad_especial) {
		this.habilidad_especial = habilidad_especial;
	}

}
