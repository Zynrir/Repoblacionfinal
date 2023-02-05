package modelo;

public class Posicion {

	private double x;
	private double y;
	
	public Posicion(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getY() {
		return y;
	}
	
	public double getX() {
		return x;
	}
	
	public double distancia(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("La posicion no puede ser nula.");
		}
		double distancia;
		
		distancia = Math.sqrt(Math.pow((posicion.getX() - this.x),2)+Math.pow((posicion.getY() - this.y),2));
		
		return distancia;
	}

	@Override
	public String toString() {
		return String.format("x= %.3f, y= %.3f", x, y);
	}
	
	
	
}