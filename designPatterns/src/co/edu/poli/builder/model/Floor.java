package co.edu.poli.builder.model;

public class Floor {
	
	private double ancho;
	private double largo;
	
	public Floor(double ancho, double largo) {
		this.ancho = ancho;
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "Floor [ancho=" + ancho + ", largo=" + largo + "]";
	}
	
}
