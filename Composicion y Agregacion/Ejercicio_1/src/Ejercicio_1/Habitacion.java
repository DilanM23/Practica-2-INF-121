package Ejercicio_1;

public class Habitacion {
	private String nombre;
	private double tamaño;
	
	public Habitacion(String nombrex, double tamañox) {
		this.nombre=nombrex;
		this.tamaño=tamañox;
	}
	
	public void mostrar_info() {
		System.out.println("<HABITACION>");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Tamaño: "+this.tamaño);
	}

	public String getNombre(String string) {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}
	
	
}
