package co.edu.poli.builder.model;

public class Door {
	
	private double alto;
	private double largo;
	
	public Door(double alto, double largo) {
		this.alto = alto;
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "Door [alto=" + alto + ", largo=" + largo + "]";
	}
	
}
