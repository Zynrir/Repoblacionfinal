package modelo;

import java.util.Random;

public class Bosque {
	public static final int MAX_ANCHURA = 100;
	public static final int MAX_ALTURA = 100;
	public static final int MINIMO = 10;
	private int ancho;
	private int alto;
	private Random generador = new Random();
	private Arbol arbolMasCentrado;
	private Arbol arbolMasAlejado;
	private Arbol[] arboles;
	
	public Bosque(int ancho, int alto, int poblacion) {
		if (ancho < MINIMO || ancho > MAX_ANCHURA) {
			throw new IllegalArgumentException("ERROR: El ancho no se encuentra entre los limites (10, 100)");
		}
		this.ancho = ancho;
		
		if (alto < MINIMO || alto > MAX_ALTURA) {
			throw new IllegalArgumentException("ERROR: El alto no se encuentra entre los limites (10, 100)");
		}
		this.alto = alto;
		arboles = new Arbol[poblacion];
		System.out.println(arboles.length);
		repoblar();
	}
	
	private void repoblar() {
		for(int i = 0; i < arboles.length; i++) {
			arboles[i] = new Arbol(Especie.values()[generador.nextInt(7)], new Posicion(generador.nextDouble(ancho) - ancho/2, generador.nextDouble(alto) - alto/2));
		}
	}
	
	public void realizarCalculos() {
		arbolMasCentrado = arboles[0] ;
		arbolMasAlejado = arboles[0];
		for(int i = 0; i < arboles.length; i++) {
			if (arboles[i].getPosicion().distancia(new Posicion(0,0)) < arbolMasCentrado.getPosicion().distancia(new Posicion(0,0))) {
				arbolMasCentrado = arboles[i];
			}
			if (arboles[i].getPosicion().distancia(new Posicion(0,0)) > arbolMasAlejado.getPosicion().distancia(new Posicion(0,0))) {
				arbolMasAlejado = arboles[i];
			}
		}
		
	}
	
	public Arbol getArbolMasCentrado() {
		if (arbolMasCentrado == null) {
			throw new NullPointerException("No se ha realizado el calculo");
		}
		return arbolMasCentrado;
	}
	public Arbol getArbolMasAlejado() {
		if (arbolMasAlejado == null) {
			throw new NullPointerException("No se ha realizado el calculo");
		}
		return arbolMasAlejado;
	}
}