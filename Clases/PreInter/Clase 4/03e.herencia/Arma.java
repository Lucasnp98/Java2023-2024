public class Arma
{
	String nombre;
	int danio;
	double probabilidad;  //[0, 1)

	Arma(String nombre, int danio, double probabilidad)
	{
		this.nombre = nombre;
		this.danio = danio;
		this.probabilidad = probabilidad;		
	}

	double getProbabilidad()
	{
		return probabilidad;
	}

	int getDanio()
	{
		return danio;
	}

	String getInfo()
	{
		return nombre + "(" + danio + ")" + probabilidad;
	}
}