public class Persona
{
    public final static int EDAD_MAXIMA = 120;
    public final static int EDAD_MINIMA = 0;

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws EdadNoValidaException
    {
        this.nombre = nombre;
        this.setEdad(edad);     
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws EdadNoValidaException
    {
        if(edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA)
            this.edad = edad;     
        else
            throw new EdadNoValidaException(edad);
    }

    @Override
    public String toString()
    {
        return "Nombre: " + nombre + " Edad: " + edad;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Persona)
        {
            Persona p = (Persona) obj;
            if (nombre.equals(p.getNombre()))
                return true;
            else
                return false;
        }
        else
            return false;
    }
}