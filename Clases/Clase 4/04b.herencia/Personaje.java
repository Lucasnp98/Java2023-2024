public class Personaje
{ 
	public final static int VIDA_MAX = 100;  //final permite declarar constantes.
	public final static int VIDA_MIN = 0;

	//Atributo de clase
	static String PARTIDA;
	
	//Atributos de instancia
	String nombre; 
	int vida;	   
	Arma arma;  

	Personaje(String nombre)
	{
		this(nombre, VIDA_MAX, null);
	}

	Personaje(String nombre, Arma arma)
	{
		this(nombre, VIDA_MAX, arma);
	}

	Personaje(String nombre, int vida, Arma arma)
	{
		this.setNombre(nombre);
		this.setVida(vida);
		this.setArma(arma);
	}

	static void setPARTIDA(String partida)
	{
		PARTIDA = partida;
	}

	String getNombre()
	{
		return nombre;
	}
	
	int getVida()
	{
		return vida;
	}

	Arma getArma()
	{
		return arma;
	}

	void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	void setVida(int vida)
	{
		if(vida >= VIDA_MIN && vida <= VIDA_MAX)
			this.vida = vida;
	}

	void setArma(Arma arma)
	{
		this.arma = arma;
	}

	void herir(int vidaARestar)
	{
		this.vida -= vidaARestar;
	}

	void addVida(int deltaVida)
	{
		vida += deltaVida;
	}

	void disparar(Personaje p)
	{
		double random = Math.random();
		if (arma != null && random < arma.getProbabilidad())
			p.herir(arma.getDanio());
	}

	String getInfo()
	{
		String armaStr = "(sin arma)";
		if (arma != null)
			armaStr = arma.getInfo();

		return PARTIDA + "<>" + nombre + "(" + vida + ")" + armaStr;
	}
}