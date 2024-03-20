public class Trabajador extends Persona
{
    String puesto;
    int sueldo;
    double porcentaje_bruto;

    Trabajador(String nombre, String dni, int edad,String puesto, int sueldo, double porcentaje_bruto)
    {
        super(nombre,dni,edad);
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.porcentaje_bruto = porcentaje_bruto;
    }
    double calculaSueldoNeto()
    {
        return sueldo * porcentaje_bruto;
    }

    @Override
    public String getInfo()
    {
        return super.getInfo() + " Puesto: "+ puesto +  " Sueldo Bruto: " + sueldo;
    }

    



}