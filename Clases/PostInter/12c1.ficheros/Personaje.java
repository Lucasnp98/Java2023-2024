public class Personaje implements java.io.Serializable
{
	//private static final long serialVersionUID = 1L;

	private String usuario;
	private int vida;
	private int madera;

	public Personaje(String usuario, int vida, int madera)
	{
		this.usuario = usuario;
		this.setVida(vida);
		this.madera = madera;
	}

	//Métodos
	public String getUsuario()
	{
		return usuario;
	}

	public int getMadera()
	{
		return madera;
	}

	public int getVida()
	{
		return vida;
	}


	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}

	public void setVida(int vida)
	{
		if(vida >= 0 && vida <= 100)
			this.vida = vida;
		else
			this.vida = 100;
	}

	public void setMadera(int madera)
	{
		this.madera = madera;
	}

	public void addMadera(int masMadera)
	{
		madera += masMadera;
	}

	public void recibirDisparo(int unaVida)
	{
		vida -= unaVida;
	}

	public void disparar(Personaje personaje)
	{
		personaje.recibirDisparo(20);	
	}

	public boolean isVivo()
	{
		return (vida > 0);
	}


	public void addVida(int deltaVida)
	{
		if ((vida + deltaVida) <= 100)
			vida += deltaVida;
		else
			vida = 100;
	}

	@Override
	public String toString()
	{
		return "Usuario: " + usuario + " Vida: " + vida + " Madera: " + madera;
	}
}