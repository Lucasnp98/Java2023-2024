package ejemplo1;
public class PrimerHilo implements Runnable {
    private String nombre;

    public PrimerHilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(nombre + " iteración: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



  
    public static void imprimirNumeros(String nombre)
    {
        System.out.println("[******]" + nombre + "[*****]");
        for (int i = 0; i<5 ; i++)
        {
            System.out.println("iteracion: " + i);
        }
    }


  

    public static void main(String[] args) {
        Thread hilo1 = new Thread(new PrimerHilo("Hilo 1"));
        Thread hilo2 = new Thread(new PrimerHilo("Hilo 2"));
        // imprimirNumeros("Ejecución 1");
        // imprimirNumeros("Ejecucion 2");

        hilo1.start();
      
        
        //System.out.println("Hola");
    }
}
