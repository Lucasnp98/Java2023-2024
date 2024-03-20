public class Personaje
{
	//Atributos
	String nombre; //null por defecto, "Luis" o "Manuel"
	int vida;	   //0
	String arma;  //null por defecto, "Pistola" o "Escopeta"

	Personaje(String nombre)
	{
		this.nombre = nombre;
		this.arma = "";
		this.vida = 100;
	}

	Personaje(String nombre, String arma)
	{
		this.nombre = nombre;
		this.arma = arma;
		this.vida = 100;
	}

	Personaje(String nombre, int vida, String arma)
	{
		this.setNombre(nombre);
		this.setVida(vida);
		this.setArma(arma);
	}

	//def get_nombre(self) -> str:
	String getNombre()
	{
		return nombre;
	}
	
	int getVida()
	{
		return vida;
	}

	String getArma()
	{
		return arma;
	}

	//def set_nombre(x:str) -> None:
	void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	void setVida(int vida)
	{
		if(vida >=0 && vida <= 999)
			this.vida = vida;
	}

	void setArma(String arma)
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
		if (arma == "Pistola" && random < 0.5)
			p.herir(10);
		else if(arma == "Escopeta" && random < 0.5)
			p.herir(20);
		else if(arma == "Francotirador")
			p.herir(200);
	}

	String getInfo()
	{
		return nombre + "(" + vida + ")" + arma;
	}

}
