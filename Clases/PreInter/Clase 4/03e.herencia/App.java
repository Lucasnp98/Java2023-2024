public class App
{
	public static void main(String args[]) 
	{

		Personaje.setPARTIDA("Partida #1");


		Arma escopeta1 = new Arma("Escopeta", 20, 0.8);
		Arma pistola1 = new Arma("Pistola", 10, 0.5);

		Personaje personajes[] = new Personaje[10];
		personajes[0] = new Personaje("The Greft", 100, escopeta1);
		personajes[1] = new Personaje("Ampeter");
		personajes[2] = new Personaje("Cobra", 80, pistola1);
		personajes[3] = new Personaje("Gemita");

		for(Personaje personaje:personajes)
			if(personaje != null) 
				System.out.println(personaje.getInfo());


		PersonajePago pp = new PersonajePago();
		pp.setNombre("Luis");
		pp.setVida(22);
		pp.setCreditos(100);

		//System.out.println(personajes[3].getInfo());
		System.out.println(pp.getInfo());

	}
}