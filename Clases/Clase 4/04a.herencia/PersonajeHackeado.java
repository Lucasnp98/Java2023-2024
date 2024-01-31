public class PersonajeHackeado extends Personaje
{
	String trucos;

	PersonajeHackeado(String nombre, int vida, Arma arma, String trucos)
	{
		super(nombre, vida, arma);
		this.setTrucos(trucos);
	}

	void addTruco(String truco)
	{
		if(trucos == "")
			trucos = truco;
		else
			trucos += ";" + truco;
	}

	void setTrucos(String trucos)
	{
		this.trucos = trucos;
	}

	String getTrucos()
	{
		return trucos;
	}

	@Override
	String getInfo()
	{
		return super.getInfo() + " Trucos: " + trucos;
	}
	
}