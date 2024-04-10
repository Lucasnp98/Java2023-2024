package ejemplo1;
class ProcesadorDeDatos implements Runnable {
    private int[] datos;
    
    public ProcesadorDeDatos(int[] datos) {
        this.datos = datos;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " iniciando procesamiento.");
        for (int valor : datos) {
            // Podríamos llamar a un método que procese los datos 
            System.out.println(Thread.currentThread().getName() + " procesando valor: " + valor);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        int[] datos1 = {1, 2, 3, 4, 5};
        int[] datos2 = {6, 7, 8, 9, 10};
        
        Thread hilo1 = new Thread(new ProcesadorDeDatos(datos1), "Procesador 1");
        Thread hilo2 = new Thread(new ProcesadorDeDatos(datos2), "Procesador 2");
        
        hilo1.start();
        hilo2.start();
    }
}
