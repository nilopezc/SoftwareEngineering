package co.edu.poli.builder.model;

public class Window {
	
	private double ancho;
	private double alto;
	
	public Window(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public String toString() {
		return "Window [ancho=" + ancho + ", alto=" + alto + "]";
	}
	
}