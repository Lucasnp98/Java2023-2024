import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.File;

import java.util.Collection;
import java.util.ArrayList;

public class IOPersonaje
{
	private static String fichero = "personajes.obj";

	public static void escribir(Collection<Personaje> personajes)
	{
		try
		{
			File file = new File(fichero);
			boolean existe = file.exists();

			FileOutputStream fos = new FileOutputStream(fichero);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			for(Personaje personaje:personajes)
				oos.writeObject(personaje);

			oos.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	public static Collection<Personaje> leer()
	{
		Collection<Personaje> personajes = new ArrayList<Personaje>();
		ObjectInputStream ois =	null;

		try
		{
			FileInputStream fis = new FileInputStream(fichero);
			ois = new ObjectInputStream(fis);

			while(true)
				personajes.add((Personaje) ois.readObject());
		
		}
		catch(EOFException eofe)
		{
			try
			{
				ois.close();
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
		}		
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Clase Personaje no existe");
		}

		return personajes;
	}
}