public class App
{

	public static void main(String args[])
	{
		// Persona p = new Persona("Lucas"); 
		// System.out.println(p.getNombre());
		// p.setDNI("578787878F");
		// System.out.println(p.getDni());
		// Persona p2 = new Persona("Ana",25,"1234545H");
		// System.out.println(p2.getNombre());
		// System.out.println(p2.getDni());
		// System.out.println(p2.getEdad());
		Persona p = new Persona("Lucas");
		System.out.println("La persona se llama: "+ p.getNombre());
		Persona p3 = new Persona("Paula",25,"1234J");
		//System.out.println("La persona se llama: "+ p3.getNombre() +" y tiene este DNI: " + p3.getDni() + " y su edad es: "+ p3.getEdad());
		System.out.println("Con el método getInfo() " + p3.getInfo());
		p3.cumplir();
		System.out.println("Con el método getInfo() " + p3.getInfo());
		
		





	}
}
