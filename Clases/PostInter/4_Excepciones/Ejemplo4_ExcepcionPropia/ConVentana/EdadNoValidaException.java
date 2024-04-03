public class EdadNoValidaException extends Exception
{
	private int edad;

	public EdadNoValidaException(int edad)
	{
		this.edad = edad;
	}

	@Override
	public String toString()
	{
		return "La edad introducida " + edad + " no es válida. Debe estar en el intervalo " + Persona.EDAD_MINIMA + " y " + Persona.EDAD_MAXIMA;
	}
}