public class App
{
	public static void main(String args[]) 
	{
		App.metodoSinEstilo();
		App.metodoConEstilo();
	}

	static void metodoSinEstilo(){
		System.out.println ("Ejemplo de for");

		int a= 3;
		int b = 5+ a;
		int suma =a*2+ 2*a* b+5;

		for(int i=0;i<10;i++){
		System.out.print(i+", ");
		a++;
		}

		System.out.println("\nEjemplo de for con condición y mucho más texto seguido que no se puede leer todo en una misma línea");

		boolean encontrado=false;

		for(int i=1;i< 10;i++)
			if(i % 3 == 0&&!encontrado)
			{System.out.println(i + " es múltiplo de 3");}

		String cadena = "Hola"+a+b+"Hola"+a+b;
		
	}

	static void metodoConEstilo()
	{
		System.out.println("Ejemplo de for");

		int a = 3;
		int b = 5 + a;
		int suma = a*2 + 2*a*b + 5;

		for(int i=0; i<10; i++)
		{
			System.out.print(i + ", ");
			a++;
		}

		System.out.println("\nEjemplo de for con condición y mucho más texto " +
					"seguido que no se puede leer todo en una misma línea");

		boolean encontrado = false;

		for(int i=1; i<10; i++)
			if(i % 3 == 0 && !encontrado)
				System.out.println(i + " es múltiplo de 3");

		String cadena = "Hola" + a + b + 
					"Hola" + a + b +
					"Hola" + a + b;
		
	}

}