package co.edu.poli.builder.model;

public class Director {

	public House getHouse (String typeHouse) {
		
		House h;
		
		if (typeHouse.equals("First Floor Apto")) {
			h = new House.Builder()
					.withType("Apto")
					.withCeil(new Ceil(5, 8))
					.withFloor(new Floor(5, 8))
					.withDoor(new Door(2.5, 1))
					.withWindow(new Window(0.2, 0.5))
					.withGarden(new Garden(5, 2))
					.build();
		} else if(typeHouse.equals("Penthouse")){
			h = new House.Builder()
					.withType("Apto")
					.withCeil(new Ceil(7, 10))
					.withFloor(new Floor(7, 10))
					.withDoor(new Door(2.7, 1))
					.withWindow(new Window(0.3, 0.55))
					.withPool(new Pool(6, 1.2, 3))
					.build();
		} else {
			h = new House.Builder()
					.withType("Apto")
					.withCeil(new Ceil(5, 8))
					.withFloor(new Floor(5, 8))
					.withDoor(new Door(2.5, 1))
					.withWindow(new Window(0.2, 0.5))
					.build();
		}
		return h;
	}
	
}
