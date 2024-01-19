
public class App
{
	public static void main(String args[])
	{
		Coche c1 = new Coche();
		c1.setMatricula("1234GYT");
		c1.setColor("Morado");
		c1.setPuertas(5);
		c1.setModelo("Ferrari");
		System.out.println("El color del coche es: "+ c1.getColor());
		System.out.println("El numero de puertas del coche es: "+ c1.getPuertas());
		System.out.println("El modelo del coche es: "+ c1.getModelo());
		System.out.println("La matrícula del coche es: "+ c1.getMatricula());
		System.out.println("El estado del motor del coche es: "+ c1.getEstado());

		c1.arrancar();
		System.out.println("¡Hola, acabo de arrancar el coche mediante el método arrancar!");
		System.out.println("El estado del motor del coche es: "+ c1.getEstado());

		c1.apagar();
		System.out.println("¡Hola, acabo de apagar el coche mediante el método apagado!");

		System.out.println("El estado del motor del coche es: "+ c1.getEstado());




	}
}