import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ventana extends JFrame
{
    private JTextField txtEdad;

    public static void main(String[] args) {
        new Ventana();
    }

    public Ventana()
    {
        txtEdad = new JTextField(10);
        this.setLayout(new FlowLayout());
        this.add(new JLabel("Edad: "));
        this.add(txtEdad);
        this.pack();


        txtEdad.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e)
            {
                switch(e.getKeyCode())
                {
                    case KeyEvent.VK_ENTER -> Ventana.this.crearPersona();
                        
                }
            }
        });
        this.setSize(250, 75);
        this.setVisible(true);
    }

    private void crearPersona()
    {
        try
        {
            int edad = Integer.parseInt(txtEdad.getText());
            JOptionPane.showMessageDialog(this, String.valueOf(edad), 
            "Información de la persona", JOptionPane.INFORMATION_MESSAGE);
           // o.m();  //Lanza una OtraException
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Error", 
            "Appp XXXX", JOptionPane.ERROR_MESSAGE);
        }
        /*catch(OtraException e)
        {
            //Error con tratamiento distinto", 
        }*/


    }
}