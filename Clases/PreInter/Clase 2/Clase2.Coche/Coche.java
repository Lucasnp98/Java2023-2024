

public class Coche
{
	//Atributos
	String modelo;
	String matricula;
	String color;
	int num_puertas;
	boolean arrancado = false;
	

	//Getters y setters
	String getMatricula()
	{
		return matricula;
	}

	void setMatricula(String x)

	{
		matricula = x;
	}
	boolean getEstado()
	{
		return arrancado;
	}

	String getModelo()
	{
		return modelo;
	}
	void setModelo(String x)
	{
		modelo = x;
	}
	String getColor()
	{
		return color;
	}
	void setColor(String x)
	{
		color = x;

	}
	int getPuertas()
	{
		return num_puertas;
	}
	void setPuertas(int x)
	{
		num_puertas = x;
	}
	//Métodos para arrancar y apagar 
	void arrancar()
	{
		arrancado = true;
	}

	void apagar()
	{
		arrancado = false;
	}



}