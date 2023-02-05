package modelo;

public enum Especie {
	  ALAMO("álamo"), ENCINA("encina"), CASTAÑO("castaño"), CIPRÉS("ciprés"), PINO("pino"), ROBLE("roble"), OLIVO("olivo");
	  
	  private final String cadenaAMostrar;
	  
	  private Especie(String cadenaAMostrar) {
	    this.cadenaAMostrar = cadenaAMostrar;
	  }
	  
	  @Override
	  public String toString() {
	    return cadenaAMostrar;
	  }


	}
