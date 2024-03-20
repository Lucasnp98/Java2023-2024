public class Persona
{
	String nombre;
	int edad;
	String dni;

	Persona(String nombre)
	{
		this.nombre = nombre;
	}

	Persona(String nombre,String Dni)
	{
		this.nombre = nombre;
		this.dni = dni;
	}
	Persona(String nombre, String dni, int edad)
	{
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}


	void cumplir()
	{
		this.edad = this.edad + 1;

	}

	String getInfo()
	{
		return "La persona se llama: "+ this.getNombre() + ", tiene "+ this.getEdad() + " y su DNI es: " + this.getDni();
	}




	String getDni()
	{
		return dni;
	}
	void setDNI(String x)
	{
		this.dni = x;
	}

	int getEdad()
	{
		return edad; 
	}

	void setEdad(int x)
	{
		this.edad = x;
	}


	String getNombre()
	{
		return nombre; 
	}
	void setNombre(String x)
	{
		this.nombre = x;
	}



}