public class Persona
{
    String nombre;
    String dni;
    int edad;

    Persona(String nombre, String dni, int edad)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getInfo()
    {
        return "Nombre: "+ nombre + " Edad: " + edad + " DNI: " + dni;
    }
}