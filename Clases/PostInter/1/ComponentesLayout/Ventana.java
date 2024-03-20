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
public class Ventana extends JFrame{

    private int ancho = 800;
    private int largo = 800;
    public static void main(String args[])
    {
        new Ventana();
    }

    public Ventana()
    {
        int ancho = 500;
        int largo = 500;

        //Paneles
        //Norte
        JPanel norte = new JPanel();
        norte.setBackground(Color.RED);
        JButton btnorte = new JButton("Botón del norte: ");
        norte.add(btnorte);
        JLabel label = new JLabel("Hola esto es una etiqueta");
        norte.add(label);
        //Sur
        JPanel sur = new JPanel();
        JButton btsur = new JButton("Boton del sur: ");
        sur.setBackground(Color.BLUE);
        sur.add(btsur);
        JRadioButton radioboton = new JRadioButton("Radio boton");
        sur.add(radioboton);

        //Centro
        JPanel centro = new JPanel();
        centro.setBackground(Color.GREEN);
        JButton btcentro = new JButton("Boton centro");
        centro.add(btcentro);
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        centro.add(comboBox);
        //Este
        JPanel este = new JPanel();
        este.setBackground(Color.GRAY);
        JTextField entrada = new JTextField("Introduce aquí tu texto");
        este.add(entrada);
        JButton bteste = new JButton("Boton este");
        este.add(bteste);

        //Oeste
        JPanel oeste = new JPanel();
        oeste.setBackground(Color.ORANGE);
        JButton btoeste = new JButton("boton oeste");
        oeste.add(btoeste);

        //Añadimos Layout
        this.setLayout(new BorderLayout());




        this.add(sur, BorderLayout.SOUTH);
        this.add(centro, BorderLayout.CENTER);
        this.add(norte, BorderLayout.NORTH);
        this.add(oeste, BorderLayout.WEST);
        this.add(este, BorderLayout.EAST);

        this.pack();
        this.setSize(ancho,largo);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para que al pulsar en la X finalice la aplicaci�n
        //Este m�todo siempre debe ser el �ltimo mensaje
        this.setVisible(true);

    }

    }