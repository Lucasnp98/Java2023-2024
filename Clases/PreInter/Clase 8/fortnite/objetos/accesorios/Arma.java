package fortnite.objetos.accesorios;

public class Arma
{
	private String nombre;
	private int danio;
	private double probabilidad;  //[0, 1)

	public Arma(String nombre, int danio, double probabilidad)
	{
		this.nombre = nombre;
		this.danio = danio;
		this.probabilidad = probabilidad;		
	}

	public double getProbabilidad()
	{
		return probabilidad;
	}

	public String getNombre()
	{
		return nombre;
	}

	public int getDanio()
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