package co.edu.poli.builder.model;

public class Pool {
	
	private double ancho;
	private double profundo;
	private double largo;
	
	public Pool(double ancho, double profundo, double largo) {
		this.ancho = ancho;
		this.profundo = profundo;
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "Pool [ancho=" + ancho + ", profundo=" + profundo + ", largo=" + largo + "]";
	}
	
}
