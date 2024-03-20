public class AppTruco
{
	public static void main(String args[]) 
	{
		System.out.println("Información de los trucos del juego:");
      	for(Truco truco : Truco.values()) 
        	System.out.println(truco + ": tiene un coste de " + truco.getCoste() + " Euros");
   

   		Truco trucoVidaMax = Truco.valueOf("MUNICION_INFINITA"); 
      	System.out.println(trucoVidaMax.getInfo());                              
  	}
}