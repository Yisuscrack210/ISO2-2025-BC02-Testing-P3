package isoII.ej3;
public class main {
	public static void main (String [] args) {
		Usuario u=new Usuario(true,false);
		Clima c=new Clima(39,59,false,false,false);
		Instalaciones i=new Instalaciones(true);
		Recomendacion r=new Recomendacion(c,u,i);
		System.out.println(r.getRecomendacion());
	}
}
