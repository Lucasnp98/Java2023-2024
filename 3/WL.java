import javax.swing.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WL extends JFrame {
    public WL() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Ventana abierta");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres cerrar la ventana?",
                "Confirmación de cierre", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                System.out.println("Ventana cerrándose");
                JOptionPane.showMessageDialog(null, "Cerrando ventana");
                WL.this.dispose();
                System.exit(0);
}
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Ventana Cerrada ");
            }

           

           

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Ventana Activa");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Ventana desactivada");
            }
        });

        this.setSize(300, 300);
        this.setVisible(true);
        this.setResizable(true);
        
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public static void main(String[] args) {
        new WL();
    }
}
