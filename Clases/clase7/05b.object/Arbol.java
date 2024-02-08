//class Arbol extends Elementos implements Picable, Guardable, Clonable
class Arbol implements Picable
{
	int vida;
	
	@Override
	public int esPicado()
	{
		vida -= 10;
		return 10;
	}	
}