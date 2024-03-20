package fortnite.objetos;

public enum Truco
{
	MUNICION_INFINITA(10), VIDA_MAXIMA(5), ARMA_PODEROSA(15);

	private int coste;

	Truco(int coste)
	{
		this.coste = coste;
	}

	public int getCoste()
	{
		return coste;
	}

	public void setCoste(int coste)
	{
		this.coste = coste;
	}

	public String getInfo()
	{
		return this.name() + " (" + coste + " Euros)";
	}

}


