public class App
{
	public static void main(String args[])
	{
		Coche coche1 = new Coche();
		coche1.setColor("Rojo");
		coche1.setMatricula("1234HYN");
		coche1.setItv(2023);
		coche1.setModelo("Golf");
		coche1.setPuertas(5);

		System.out.println("El coche es de color: " + coche1.getColor());
		System.out.println("¿Está arrancado el coche? -> "+ coche1.getEstadoMotor());

		coche1.arrancar();
		System.out.println("¡Acabo de arrancar el coche mediante el método arrancar! ");
		System.out.println("¿Está arrancado el coche? -> "+ coche1.getEstadoMotor());
		System.out.println("Numero de puertas del coche: -> " + coche1.getPuertas());





	

	}
}