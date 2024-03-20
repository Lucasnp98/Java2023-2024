public class Coche 
{
	String modelo;
	String matricula;
	String color;
	int itv;
	boolean arrancado; 
	int num_puertas; 
	Coche (String modelo)
	{
		this.modelo = modelo;
		this.matricula = "1234";
		this.itv = 2023;
		this.arrancado = false;
		this.num_puertas = 5;

	}
	
	//Getters y Setters
	String getModelo(){
		return modelo;
	}
	String getMatricula(){
		return matricula;
	}
	String getColor(){
		return color;
	}
	int getItv(){
		return itv;
	}

	void setModelo(String x){
		modelo = x;

	}

	boolean getEstadoMotor(){
		return arrancado;
			}
	int getPuertas(){
		return num_puertas;
	}
	void setPuertas(int x){
		num_puertas = x;
	}
	void arrancar(){
		arrancado = true;
	}
	void parar(){
		arrancado = false;
	}
	void setColor(String x){
		color = x;
	}
	void setMatricula(String x){
		matricula = x;
	}
	void setItv(int x){
		itv = x;
	}
}