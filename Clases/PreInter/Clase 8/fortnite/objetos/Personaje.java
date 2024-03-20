package fortnite.objetos;

import fortnite.objetos.accesorios.Arma;
import fortnite.objetos.accesorios.Picable;

public class Personaje implements Picable
{ 
	public final static int VIDA_MAX = 100;  //final permite declarar constantes.
	public final static int VIDA_MIN = 0;

	//Atributo de clase
	private static String PARTIDA;
	
	//Atributos de instancia
	private String nombre; 
	protected int vida;   
	private Arma arma; 
	private int materialPicado;

	public Personaje(String nombre)
	{
		this(nombre, VIDA_MAX, null);
	}

	public Personaje(String nombre, Arma arma)
	{
		this(nombre, VIDA_MAX, arma);
	}

	public Personaje(String nombre, int vida, Arma arma)
	{
		this.setNombre(nombre);
		this.setVida(vida);
		this.setArma(arma);
		this.materialPicado = 0;
	}

	public static void setPARTIDA(String partida)
	{
		PARTIDA = partida;
	}

	public String getNombre()
	{
		return nombre;
	}
	
	public int getVida()
	{
		return vida;
	}

	public Arma getArma()
	{
		return arma;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setVida(int vida)
	{
		if(vida >= VIDA_MIN && vida <= VIDA_MAX)
			this.vida = vida;
	}

	public void setArma(Arma arma)
	{
		this.arma = arma;
	}

	public void herir(int vidaARestar)
	{
		this.vida -= vidaARestar;
	}

	public void addVida(int deltaVida)
	{
		vida += deltaVida;
	}

	public void disparar(Personaje p)
	{
		double random = Math.random();
		if (arma != null && random < arma.getProbabilidad())
			p.herir(arma.getDanio());
	}

	public void picar(Picable picable)
	{
		materialPicado += picable.esPicado();

		if (picable instanceof Personaje)
		{
			//DOWNCASTING
			Personaje personaje = (Personaje) picable;  //DOWNCASTING
			personaje.herir(10);
		}
	}

	@Override
	public int esPicado()
	{
		return 0;
	}	
/*
	Personaje no es un objeto de tipo Picable 
	void picar(Personaje personaje)
	{
		personaje.herir(10);
	}

	*/

	@Override
	public String toString()
	{
		String armaStr = "(sin arma)";
		if (arma != null)
			armaStr = arma.toString();

		return PARTIDA + "<>" + nombre + "(" + vida + ")" + armaStr + " #" + materialPicado;
	}
}