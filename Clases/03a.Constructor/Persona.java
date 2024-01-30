public class Persona
{
	String nombre;
	int edad;
	String dni;


	Persona(String nombre)
	{
		this.nombre = nombre;
	}


	Persona(String nombre,int edad, String dni)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni; 
	}





	void cumplir()
	{
		this.edad = this.edad + 1;
		

	}

	 String getInfo()
	{
	 	return "La persona se llama: "+ this.nombre +  ", tiene "+ this.edad + " y su DNI es: " + this.dni;
	}




	String getDni()
	{
		return this.dni;
	}
	void setDNI(String x)
	{
		this.dni = x;
	}

	int getEdad()
	{
		return this.edad; 
	}

	void setEdad(int x)
	{
		this.edad = x;
	}


	String getNombre()
	{
		return this.nombre; 
	}
	void setNombre(String x)
	{
		this.nombre = x;
	}



}