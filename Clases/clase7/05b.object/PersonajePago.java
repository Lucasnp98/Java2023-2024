public class PersonajePago extends Personaje
{
	int creditos;

	PersonajePago(String nombre, int vida, Arma arma, int creditos)
	{
		super(nombre, vida, arma);
		this.setCreditos(creditos);
	}

	void setCreditos(int creditos)
	{
		this.creditos = creditos;
	}

	int getCreditos()
	{
		return creditos;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " Cred: " + creditos;
	}
	
}