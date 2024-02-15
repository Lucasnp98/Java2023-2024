package fortnite.objetos.accesorios;

public class Arbol implements Picable
{
	int vida;
	
	@Override
	public int esPicado()
	{
		vida -= 10;
		return 10;
	}	
}