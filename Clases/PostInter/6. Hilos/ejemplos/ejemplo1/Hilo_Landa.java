package ejemplo1;
public class Hilo_Landa {
    public static void main(String[] args) {
        // Utilizando expresión landa
        Thread miHilo = new Thread(() -> {
            // Este código se ejecuta en el hilo
            for (int i = 0; i < 5; i++) {
                System.out.println("Dentro del hilo: " + Thread.currentThread().getName() + ", iteración: " + i);
                try {
                
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " ha sido interrumpido.");
                }
            }
        });

       //Arranco el hilo
        miHilo.start();

        
        System.out.println("En el hilo principal: " + Thread.currentThread().getName());
    }
}
