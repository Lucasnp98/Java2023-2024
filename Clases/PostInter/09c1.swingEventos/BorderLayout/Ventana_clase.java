import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
public class Ventana_clase extends JFrame{



    public static void main(String args[])
    {
        new Ventana_clase();
    }
    public Ventana_clase()
    {

       
        super("Mi primera ventana");
        int ancho = 400;
        int largo = 500;

        
        JLabel lblTitulo = new JLabel("Aquí tu título");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setForeground(new Color(112, 146, 190));
        // pnlNorte.add(lblTitulo);
        
        JPanel panelnorte = new JPanel();
        panelnorte.add(lblTitulo);


        JPanel panel_c = new JPanel(new FlowLayout(1, 10, 10));

        JButton b1 = new JButton("Boton 1");
        JButton b2 = new JButton("Boton 2");
        JButton b3 = new JButton("Boton 3");
        b3.setForeground(Color.white);
        b3.setBackground(Color.BLACK);
        panel_c.add(b1);
        panel_c.add(b2);
        panel_c.add(b3);
        panel_c.setBackground(Color.RED);

        JPanel panelsur = new JPanel();

        panelsur.setBackground(Color.GREEN);
        panelsur.setSize(new Dimension(200,200));
        JButton b4 = new JButton();
        panelsur.add(new JLabel("Hola esto es una etiqueta"));

       



        this.setLayout(new BorderLayout());

        this.add(panel_c,BorderLayout.CENTER);
        this.add(panelsur, BorderLayout.SOUTH);
        this.add(panelnorte,BorderLayout.NORTH);





    
    
        

        

        
    


    this.pack();
    this.setSize(ancho,largo);
    this.setResizable(true);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para que al pulsar en la X finalice la aplicaci�n
    //Este m�todo siempre debe ser el �ltimo mensaje
    this.setVisible(true);
    }
}