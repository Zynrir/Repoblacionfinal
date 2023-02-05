package repoblacion;

import modelo.Bosque;
import utilidades.consola;

public class MainApp {
	private static Bosque bosque;
	
	public static void main(String[] args) {
		int altura;
		int anchura;
		int poblacion;
		
		altura = consola.leerAltura();
		anchura = consola.leerAnchura();
		do {
			poblacion = consola.leerPoblacion();
		} while (poblacion > 2*(altura+anchura));
		
		bosque = new Bosque(anchura, altura, poblacion);
		
		bosque.realizarCalculos();
		System.out.printf("El arbol más alejado al centro es: %s %nY el mas cercano: %s%n", bosque.getArbolMasAlejado(), bosque.getArbolMasCentrado());
		
	}

}
