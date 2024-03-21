import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EjemploML extends JFrame {
    public EjemploML() {
        JPanel panel = new JPanel();
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse presionado y soltado en: "+ e.getX());
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse presionado");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse soltado");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entra");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse sale");
            }
        });

        this.add(panel);
        this.setSize(300, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new EjemploML();
    }
}
