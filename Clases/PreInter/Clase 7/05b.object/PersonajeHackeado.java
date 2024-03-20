public class PersonajeHackeado extends PersonajePago
{
	Truco trucos[] = new Truco[10];

	PersonajeHackeado(String nombre, int vida, Arma arma, int creditos, Truco truco)
	{
		super(nombre, vida, arma, creditos);
		this.addTruco(truco);
	}

	PersonajeHackeado(String nombre, int vida, Arma arma, int creditos, Truco trucos[])
	{
		super(nombre, vida, arma, creditos);
		this.setTrucos(trucos);
	}

	void addTruco(Truco truco)
	{
		if(creditos > truco.getCoste())
			for(int i = 0;i < trucos.length; i++)
				if (trucos[i] == null)
				{
					trucos[i] = truco;
					creditos -= truco.getCoste();
					i = trucos.length;
				}

	}

	void setTrucos(Truco trucos[])
	{
		this.trucos = trucos;
	}

	Truco[] getTrucos()
	{
		return trucos;
	}

	@Override
	void herir(int vidaARestar)
	{
		boolean vida_max_hack = false; 

		for(Truco truco : trucos)
			if(truco != null)
				if (truco == Truco.VIDA_MAXIMA)
					vida_max_hack = true;

		if (!vida_max_hack) 
			this.vida -= vidaARestar;
	}

	@Override
	public String toString()
	{
		String listadoTrucos = "";
		for(Truco truco : trucos)
			if(truco != null)
				listadoTrucos += "\t- " + truco.getInfo() + "\n";

		return super.toString() + " Trucos: \n" + listadoTrucos;
	}
	
}