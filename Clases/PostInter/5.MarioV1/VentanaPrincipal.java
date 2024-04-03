import javax.security.auth.login.AppConfigurationEntry;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class VentanaPrincipal extends JFrame {
    Fondo fondo;
    VentanaPrincipal()
    {
        super("Mi primer Juego");
        
        fondo = new Fondo();
        this.add(fondo);
        this.setVisible(true);
        this.setResizable(true);
        //this.setSize(400,640);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fondo.requestFocus();//Necesito el foco
        
    }

    public static void main(String[] args)
    {
        new VentanaPrincipal();
    }
    
}
