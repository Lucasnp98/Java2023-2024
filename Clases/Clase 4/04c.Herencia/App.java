public class App 
{
    public static void main (String args [])
    {

        Trabajador t1 = new Trabajador("Lucas", "50X", 25,"Profe", 10, 0.25 );
        System.out.println(t1.getInfo());
        System.out.println("SueldoNeto: " +  t1.calculaSueldoNeto());
        Directivo d = new Directivo("Ana","321H",25,"Manager",20,0.25,100);
        System.out.println("Directivo: "+ d.calculaSueldoNeto());


    }
}