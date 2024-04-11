import java.util.ArrayList;
import java.util.Collection;

public class AppPersonaje
{
	public static void main(String args[]) 
	{
		//AppPersonaje.crearPersonajes();
		AppPersonaje.leerPersonajes();
	}

	private static void crearPersonajes()
	{
		Collection<Personaje> personajes = new ArrayList<Personaje>();

		Personaje personaje1 = new Personaje("The Grefg", 9999999, 50);
		personajes.add(personaje1);
		personajes.add(new Personaje("Ampeter", 100, 0));
		personajes.add(new Personaje("Ana", 444, 11));

		IOPersonaje.escribir(personajes);
	}
	
	private static void leerPersonajes() 
	{
		System.out.println(IOPersonaje.leer());
	}
}