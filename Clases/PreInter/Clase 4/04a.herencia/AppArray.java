public class AppArray
{
	public static void main(String args[]) 
	{
		Personaje.setPARTIDA("Partida #1");

		Arma escopeta1 = new Arma("Escopeta", 20, 0.8);
		Arma pistola1 = new Arma("Pistola", 10, 0.5);

		//El array podrá almacenar todo tipo de personajes
		Personaje personajes[] = new Personaje[10];
		personajes[0] = new Personaje("The Greft", 100, escopeta1);
		personajes[1] = new Personaje("Ampeter");
		personajes[2] = new Personaje("Cobra", 80, pistola1);
		personajes[3] = new Personaje("Gemita");

		PersonajePago pp = new PersonajePago("Luis", 22, pistola1, 100);

		personajes[4] = pp;  

		PersonajeHackeado ph = new PersonajeHackeado("Luis", 22, escopeta1, "Munición infinita");
		ph.addTruco("Vida Máxima");
		ph.addTruco("Arma poderosa");

		personajes[5] = ph; 

		for(Personaje personaje : personajes)
			if(personaje != null) 
				System.out.println(personaje.getInfo());
	}
}