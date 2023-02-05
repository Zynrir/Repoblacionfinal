package utilidades;

import org.iesalandalus.programacion.utilidades.Entrada;

import modelo.Bosque;

public class consola {
	private consola() {
		
	}
	
	public static int leerAnchura() {
	    int anchura;
	    do {
	    	System.out.println("Introduce una anchura entre " + Bosque.MINIMO + " y " + Bosque.MAX_ANCHURA);
	    	System.out.print("Introduzca la anchura:");
	        anchura = Entrada.entero();
	        if (anchura < Bosque.MINIMO || anchura > Bosque.MAX_ANCHURA) {
	            System.out.println("Introduzca una anchura entre " + Bosque.MINIMO + " y " + Bosque.MAX_ANCHURA);
	        }
	    } while (anchura < Bosque.MINIMO || anchura > Bosque.MAX_ANCHURA);
	    return anchura;
	}
	public static int leerAltura()  {
		int altura;
		do {
			System.out.println("Introduce una Altura entre " + Bosque.MINIMO + " y " + Bosque.MAX_ALTURA);
			System.out.print("Introduzca la Altura: ");
			altura = Entrada.entero();
		} while (altura < Bosque.MINIMO || altura > Bosque.MAX_ALTURA);
		return altura;
	}
	
	
	public static int leerPoblacion() {
		int poblacion;
		do {
			System.out.println("Tienes que poner un valor entre el 1 y el 7.");
			System.out.print("Introduzca la poblacion: ");
			poblacion = Entrada.entero();
		} while (poblacion <= 0);
		return poblacion;
	}
}
