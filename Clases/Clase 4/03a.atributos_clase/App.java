public class App
{
	public static void main(String args[]) 
	{

		Personaje.setPARTIDA("Partida #1");

		Personaje personajes[] = new Personaje[10];
		personajes[0] = new Personaje("The Greft", 100, "Escopeta");
		personajes[1] = new Personaje("Ampeter");
		personajes[2] = new Personaje("Cobra", 80, "Pistola");
		personajes[3] = new Personaje("Gemita");
		System.out.println("HOLA");

		for(Personaje personaje:personajes)
			if(personaje != null) 
				System.out.println(personaje.getInfo());

		for(int i=0; i<personajes.length; i++)
			if(personajes[i] != null) 
				System.out.println(personajes[i].getInfo());


	}
}