package isoII.ej3;

public class Usuario {
	private boolean plenas_facultades; 
	private boolean sintomas;
	
	
	public Usuario(boolean plenas_facultades, boolean sintomas) {
		this.plenas_facultades = plenas_facultades;
		this.sintomas = sintomas;
	}


	public boolean isPlenas_facultades() {
		return plenas_facultades;
	}


	public void setPlenas_facultades(boolean plenas_facultades) {
		this.plenas_facultades = plenas_facultades;
	}


	public boolean isSintomas() {
		return sintomas;
	}


	public void setSintomas(boolean sintomas) {
		this.sintomas = sintomas;
	} 
	
	
	 
}
