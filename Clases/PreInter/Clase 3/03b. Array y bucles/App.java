public class App
{
	public static void main (String args[])
	{
		Persona p1 = new Persona("Lucas","123478J",25);
		Persona p2 = new Persona("Pepe","12345678K",27);
		Persona p3 = new Persona("Paula", "178680J",25);


		// Python  personas = []

		Persona personas[] = new Persona[20];

		personas[0] = p1;
		personas[1] = p2;
		personas[2] = p3;
		personas[3] = new Persona("Ana","12345JY",26);

		// System.out.println(personas[0].getInfo());
		// System.out.println(personas[1].getInfo());
		// System.out.println(personas[2].getInfo());


		// lista = [p1,p2,p3]
		// for i in range(len(lista)):
		// 	print(lista[i])


		// contador = 0
		// while contador < 3:
		// 	contador += 1


		// for (int i = 0 ; i<personas.length; i++)

		// {
		// 	System.out.println(personas[i].getInfo());
		// }

		 System.out.println("---------------------------");
		 // for elemento in lista: 
		 // 	print(elemento)

		for(Persona persona_aux:personas)
			if(persona_aux != null) 
				System.out.println(persona_aux.getInfo());





	}
}