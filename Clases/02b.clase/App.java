public class App
{
	public static void main(String args[]) 
	{

		Personaje miPersonaje1 = new Personaje();
		miPersonaje1.setNombre("The Greft");
		miPersonaje1.setVida(100);
		miPersonaje1.setArma("Pistola");

		Personaje miPersonaje2 = new Personaje();
		String nombre = "Luis";
		miPersonaje2.setNombre(nombre);
		miPersonaje2.setVida(100);
		miPersonaje2.setArma(null);

		System.out.println("Personaje 1:"+miPersonaje1.getNombre());
		System.out.println("Personaje 1:"+miPersonaje1.getVida());
		System.out.println("Personaje 2:"+miPersonaje2.getNombre());
		
	}
}