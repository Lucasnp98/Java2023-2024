package fortnite.ui;

import fortnite.objetos.Personaje;
import fortnite.objetos.PersonajePago;
import fortnite.objetos.PersonajeHackeado;
import fortnite.objetos.Truco;

import fortnite.objetos.accesorios.Arma;

public class AppArray
{
	static Personaje personajes[];	

	public static void main(String args[]) 
	{
		/*
		Personaje personajes[] = AppArray.init();
		AppArray.print(personajes);
		*/
		
		
		AppArray.init();
		AppArray.print();
		
		//AppArray.comparar();
	}

	public static void comparar()
	{
		Arma arma1 = new Arma("Escopeta", 20, 0.7);
		Arma arma2 = new Arma("Escopeta", 20, 0.8);
		//System.out.println(arma1 == arma2);
		System.out.println(arma1.equals(arma2));


		//arma1.danio = -999;
		//arma1.setDanio(-999);
/*
		String nombre1 = new String("Luis");
		String nombre2 = new String("Luis");
		System.out.println(nombre1 == nombre2);
		System.out.println(nombre1.equals(nombre2));

		System.out.println(22 == 22);*/
	}

	//public static Personaje[] init()
	public static void init()
	{
		Personaje.setPARTIDA("Partida #1");

		Arma escopeta1 = new Arma("Escopeta", 20, 0.8);
		Arma pistola1 = new Arma("Pistola", 10, 0.5);

		//El array podrá almacenar todo tipo de personajes
		personajes = new Personaje[10];
		personajes[0] = new Personaje("The Greft", 100, escopeta1);
		personajes[1] = new Personaje("Ampeter");
		personajes[2] = new Personaje("Cobra", 80, pistola1);
		personajes[3] = new Personaje("Gemita");

		PersonajePago pp = new PersonajePago("Luis", 22, pistola1, 100);
		personajes[4] = pp;  

		PersonajeHackeado ph = new PersonajeHackeado("Luis", 22, escopeta1, 100, Truco.MUNICION_INFINITA);
		ph.addTruco(Truco.VIDA_MAXIMA);
		ph.addTruco(Truco.ARMA_PODEROSA);

		personajes[5] = ph; 
	}

	//public static void print(Personaje personajes[])
	public static void print()
	{
		for(Personaje personaje : personajes)
			if(personaje != null) 
				System.out.println(personaje);
	}
}