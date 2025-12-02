package isoII.ej3;

public class Recomendacion {
	private Clima clima;
	private Usuario usuario;
	private Instalaciones instalaciones;
	public Recomendacion(Clima c, Usuario u, Instalaciones i) {
		this.clima=c;
		this.instalaciones=i;
		this.usuario=u;
	}
	public String getRecomendacion() {
		String recomendacion="";
		if(usuario.isSintomas()||!usuario.isPlenas_facultades()) {
			recomendacion="No hagas ninguna actividad";
		}
		else if(clima.getTemperatura()<0&&clima.getHumedad()<15&&(clima.isPrec_agua()||clima.isPrec_nieve())) {
			recomendacion="Quédate en casa";
		}
		else if(clima.getTemperatura()<0&&clima.getHumedad()<15&&!clima.isPrec_agua()&&!clima.isPrec_nieve()) {
			if(instalaciones.isAforo()) {
				recomendacion="No puedes ir  esquiar. El aforo se ha superado";
			}
			else {
				recomendacion="Puedes ir a esquiar";
			}
		}
		else if(clima.getTemperatura()>0&&clima.getTemperatura()<15&&!clima.isPrec_agua()) {
			if(instalaciones.isAforo()) {
				recomendacion="No puedes hacer senderismo o escalada. El aforo se ha superado";
			}
			else{
				recomendacion="Puedes hacer senderismo o escalada";
			}	
		}
		else if(clima.getTemperatura()>15&&clima.getTemperatura()<25&&clima.getHumedad()>60&&!clima.isPrec_agua()&&!clima.isNublado()) {
			recomendacion="Puedes hacer cualquier actividad del catálogo de verano, primavera y otoño";
		}
		else if(clima.getTemperatura()>25&&clima.getTemperatura()<35&&!clima.isPrec_agua()) {
			if(instalaciones.isAforo()) {
				recomendacion="No puedes hacer cualquier actividad cultural o gastronómica. El aforo se ha superado";
			}
			else {
				recomendacion="Puedes hacer cualquier actividad cultural o gastronómica";
			}
		}
		else if(clima.getTemperatura()>30&&!clima.isPrec_agua()) {
			if(instalaciones.isAforo()) {
				recomendacion="Puedes ir a la playa, pero no a la piscina. El aforo se ha superado";
			}
			else {
				recomendacion="Puedes ir a la playa o a la piscina";
			}
		}
		return recomendacion;
	}
}
