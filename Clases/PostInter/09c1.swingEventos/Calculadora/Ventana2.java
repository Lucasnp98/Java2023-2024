import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.util.ArrayList;

public class Ventana2 extends JFrame {

    public static void main(String[] args) {
        new Ventana2();
    }

    public Ventana2() {
        
        int ancho = 800;
        int largo = 500;
        //Colores
        Color  gris = new Color(169,169,169);
        Color gris_oscuro = new Color(100,100,100);
        
        //Panel Norte
        JPanel pnlNorte = new JPanel();
        JLabel etiqueta = new JLabel("Primera calculadora"); 
        Font fuente = new Font("Comic Sans", Font.BOLD, 40);
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setFont(fuente);
        pnlNorte.add(etiqueta);
        pnlNorte.setBackground(gris_oscuro);

        //Panel Centro, establecemos el GridLayout
        JPanel panelcentro = new JPanel(new GridLayout(5,3,10,10));
        panelcentro.setBackground(gris);
        //Creamos botones
        String[] simbolos =  {"1","2","3","4","5","6","7","8","9","+","0","-","*","/","C"};
        for (String simbolo:simbolos)
        {
            panelcentro.add(new MiBoton(simbolo,fuente));

        }
        //Panel sur
        JPanel panelsur = new JPanel();
        panelsur.setBackground(gris_oscuro);
        JLabel etiquetasur = new JLabel("By Lucas Novales");
        etiquetasur.setFont(fuente);
        panelsur.add(etiquetasur);
        
        // Establecer BorderLayout en el JFrame y agregar el panel al centro
        this.setLayout(new BorderLayout());
        this.add(panelcentro, BorderLayout.CENTER);
        this.add(pnlNorte,BorderLayout.NORTH);
        this.add(panelsur,BorderLayout.SOUTH);
        //this.setSize(ancho,largo);
        this.pack();
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
