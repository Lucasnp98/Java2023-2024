public class App
{
	public static void main(String args[]) 
	{
		Personaje miPersonaje1 = new Personaje("The Greft", 999, "Francotirador");
		Personaje miPersonaje2 = new Personaje("Ampeter");

		int vida = miPersonaje2.getVida();

		int disparo = 1;





		while (vida == 100)
		{
			System.out.println("Disparo #" + disparo);
			miPersonaje1.disparar(miPersonaje2);
			vida = miPersonaje2.getVida(); 
			disparo++;
		}

		System.out.println("Le di!");
		System.out.println("Vida de Personaje 2: " + vida);


		miPersonaje2.addVida(10);  //como una manzana
		// System.out.println("Vida: " + miPersonaje2.getVida());
		// miPersonaje1.setVida(999);
		// System.out.println("Vida: " + miPersonaje2.getVida());

		// //PERMITIDO: SUSPENSO --> miPersonaje1.vida = -999;

		// System.out.println(miPersonaje1.getInfo());

	}
}
