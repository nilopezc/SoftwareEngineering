package co.edu.poli.builder.model;

public class Garden {
	
	private double largo;
	private double ancho;
	
	public Garden(double largo, double ancho) {
		this.largo = largo;
		this.ancho = ancho;
	}

	@Override
	public String toString() {
		return "Garden [largo=" + largo + ", ancho=" + ancho + "]";
	}
	
	

}
