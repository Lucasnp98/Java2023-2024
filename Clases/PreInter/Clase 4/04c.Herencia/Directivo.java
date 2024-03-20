public class Directivo extends Trabajador
{

    double bonus;
    Directivo(String nombre, String dni, int edad,String puesto, int sueldo, double porcentaje_bruto, double bonus)
    {
        super(nombre,dni,edad,puesto,sueldo,porcentaje_bruto);
        this.bonus = bonus;
    }

    @Override
    double calculaSueldoNeto()
    {
     return super.calculaSueldoNeto() + bonus;
    }

}