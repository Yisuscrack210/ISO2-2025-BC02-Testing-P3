package isoII.ej3;

public class Clima {
	private int 	temperatura; 
	private int 	humedad; 	//lo vamos a medir en porcentaje
	private boolean prec_agua; 	//precipitaciones de agua
	private boolean prec_nieve; //precipitaciones de nieve
	private boolean nublado;
	
	
	public Clima(int temperatura, int humedad, boolean prec_agua, boolean prec_nieve, boolean nublado) {
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.prec_agua = prec_agua;
		this.prec_nieve = prec_nieve;
		this.nublado=nublado;
	}
	


	public double getTemperatura() {
		return temperatura;
	}


	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}


	public double getHumedad() {
		return humedad;
	}


	public void setHumedad(int humedad) {
		this.humedad = humedad;
	}


	public boolean isPrec_agua() {
		return prec_agua;
	}


	public void setPrec_agua(boolean prec_agua) {
		this.prec_agua = prec_agua;
	}


	public boolean isPrec_nieve() {
		return prec_nieve;
	}


	public void setPrec_nieve(boolean prec_nieve) {
		this.prec_nieve = prec_nieve;
	}



	public boolean isNublado() {
		return nublado;
	}



	public void setNublado(boolean nublado) {
		this.nublado = nublado;
	}
	
	
	
	
	
	
}
