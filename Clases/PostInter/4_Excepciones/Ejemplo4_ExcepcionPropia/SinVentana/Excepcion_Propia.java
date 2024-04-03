public class Excepcion_Propia {
    public static void main(String[] args) throws EdadNoValidaException {

        Persona p = new Persona("Lucas",20);
        System.out.println(p.toString());

        try {
            Persona p2 = new Persona("Ana",200);
            System.out.println(p2.toString());
            
        } catch (EdadNoValidaException e) {
            System.out.println(e.toString());
        }
        
        

        System.out.println("Esto debería ejecutarse...");
    }
    
}
