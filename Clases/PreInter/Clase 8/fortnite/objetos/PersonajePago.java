package fortnite.objetos;

import fortnite.objetos.accesorios.Arma;

public class PersonajePago extends Personaje
{
	protected int creditos;

	public PersonajePago(String nombre, int vida, Arma arma, int creditos)
	{
		super(nombre, vida, arma);
		this.setCreditos(creditos);
	}

	public void setCreditos(int creditos)
	{
		this.creditos = creditos;
	}

	public int getCreditos()
	{
		return creditos;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " Cred: " + creditos;
	}
	
}