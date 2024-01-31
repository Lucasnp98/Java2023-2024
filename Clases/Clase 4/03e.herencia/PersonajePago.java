public class PersonajePago extends Personaje
{
	int creditos;

	void setCreditos(int creditos)
	{
		this.creditos = creditos;
	}

	int getCreditos()
	{
		return creditos;
	}

	@Override
	String getInfo()
	{
		return super.getInfo() + " Cred: " + creditos;
	}
	
}