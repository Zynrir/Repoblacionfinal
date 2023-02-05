package modelo;

public class Arbol {

	private Especie especie;
	private Posicion posicion;
	
	public Arbol(Especie especie, Posicion posicion) {
		setEspecie(especie);
		setPosicion(posicion);
	}
	
	

	public Especie getEspecie() {
		return especie;
	}
	private void setEspecie(Especie especie) {
		if (especie == null) {
			throw new NullPointerException("La posicion del personaje no puede ser nulo.");
		}
		this.especie = especie;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("La posicion del personaje no puede ser nulo.");
		}
		this.posicion = posicion;
	}
	
	@Override
	public String toString() {
		return String.format("%n %s%nSe encuentra en la posicion: %s", especie, posicion);
	}
}
