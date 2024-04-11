import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class LaminaPelota extends JPanel {
    private ArrayList<Pelota> pelotas = new ArrayList<>();
    private Thread hilo;

    public void add(Pelota b) {
        pelotas.add(b);
        if (hilo == null) {
            hilo = new Thread(new GestorMovimiento(this));
            hilo.start();
        }
    }

    public void actualizarPelotas() {
        for (Pelota pelota : pelotas) {
            pelota.mueve_pelota(getBounds());
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Pelota b : pelotas) {
            g2.fill(b.getShape());
        }
    }
}
