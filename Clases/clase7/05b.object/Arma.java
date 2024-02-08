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

	String getNombre()
	{
		return nombre;
	}

	int getDanio()
	{
		return danio;
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof Arma)
		{
			Arma a = (Arma) o;
			if (a.getNombre().equals(nombre) && a.getDanio() == danio)
				return true;
			else
				return false;
		}
		else
			return false;
	}

	@Override
	public String toString()
	{
		return nombre + "(" + danio + ")" + probabilidad;
	}
}