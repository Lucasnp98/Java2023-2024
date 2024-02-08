public enum Truco
{
	MUNICION_INFINITA(10), VIDA_MAXIMA(5), ARMA_PODEROSA(15);

	int coste;

	Truco(int coste)
	{
		this.coste = coste;
	}

	int getCoste()
	{
		return coste;
	}

	void setCoste(int coste)
	{
		this.coste = coste;
	}

	String getInfo()
	{
		return this.name() + " (" + coste + " Euros)";
	}

}


