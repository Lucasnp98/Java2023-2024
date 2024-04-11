public class GestorMovimiento implements Runnable {
    private LaminaPelota lamina;

    public GestorMovimiento(LaminaPelota lamina) {
        this.lamina = lamina;
    }

    @Override
    public void run() {
        while (true) {
            lamina.actualizarPelotas();
            lamina.repaint();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
