package isoII.ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class recomendacionActividadesTest {
	//cobertura de decisiones: al menos una debe ser false//
	
	@Test
	void usuarioConSintomas() {
		Usuario user = new Usuario(true, true);	//en plenas facultades pero con sintomas de enfermedad
		Clima clim = new Clima(20,40,false,false,false);
		Instalaciones inst = new Instalaciones(false);
		
		Recomendacion r = new Recomendacion(clim,user,inst);
		assertEquals("No hagas ninguna actividad",r.getRecomendacion());
	}
	
	@Test
	void enCasa() {
		Usuario user = new Usuario(true,false);
		Clima clim = new Clima(-3,13,true,true,false);
		Instalaciones inst = new Instalaciones(false);
		
		Recomendacion r = new Recomendacion(clim,user,inst);
		assertEquals("Quédate en casa", r.getRecomendacion());
	}
	
	@Test
	void elegirParaEsquiar() {
		Usuario user = new Usuario(true, false);
		Clima clim = new Clima(-1,11,false,false,false);
		Instalaciones inst = new Instalaciones(false);
		
		Recomendacion r = new Recomendacion(clim,user,inst);
		assertEquals("Puedes ir a esquiar",r.getRecomendacion());
	}
	
	@Test
	void elegirParaSenderismoEscalada() {
		Usuario user = new Usuario(true,false);
		Clima clim = new Clima(5,25,false,false,false);
		Instalaciones inst = new Instalaciones(true);
		
		Recomendacion r = new Recomendacion(clim,user,inst);
		assertEquals("No puedes hacer senderismo o escalada. El aforo se ha superado",r.getRecomendacion());
	}
	
	@Test
	void catalogoGeneral() {
		Usuario user = new Usuario(true,false);
		Clima clim = new Clima(23,50,false,false,false);
		Instalaciones inst = new Instalaciones(false);
		
		Recomendacion r = new Recomendacion(clim,user,inst);
		assertEquals("Puedes hacer cualquier actividad del catálogo de verano, primavera y otoño",r.getRecomendacion());
	}
	
	@Test 
	void actividadesCulturales() {
		Usuario user = new Usuario(true,false);
		Clima clim = new Clima(27,40,false,false,false);
		Instalaciones inst = new Instalaciones(true);
		
		Recomendacion r = new Recomendacion(clim,user,inst);
		assertEquals("No puedes hacer cualquier actividad cultural o gastronómica. El aforo se ha superado",r.getRecomendacion());
	}
	
	@Test
	void playaOPiscina() {
		Usuario user = new Usuario(true,false);
		Clima clim = new Clima(37,40,false,false,false);
		Instalaciones inst = new Instalaciones(false);
		
		Recomendacion r = new Recomendacion(clim,user,inst);
		assertEquals("Puedes ir a la playa o a la piscina",r.getRecomendacion());
	}
}