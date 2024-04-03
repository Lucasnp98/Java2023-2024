/*Enlazado con slack v2 */
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.Font;
import java.awt.Color;

public class JVentana extends JFrame
{
    private Persona p;
    private JTextField txtNombre;
    private JTextField txtEdad;

    public static void main(String[] args)
    {
        new JVentana();
    }

	public JVentana()
	{
        //super();
        super("Personas");

        //this.setLayout(new FlowLayout());
        JPanel pnlNorte = new JPanel(new FlowLayout());
        JPanel pnlCentro = new JPanel(new GridLayout(3, 2));
        JPanel pnlSur = new JPanel(new GridLayout(1, 2));

        JLabel lblTitulo = new JLabel("Gestion de Personas");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setForeground(new Color(112, 146, 190));
        //lblTitulo.setForegroung(Color.BLUE);
        pnlNorte.add(lblTitulo);

        JButton btnAceptar = new JButton("Aceptar");
        JButton btnCancelar = new JButton("Cancelar");

        btnAceptar.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    try
                    {
                        String nombre = txtNombre.getText();
                        int edad = Integer.parseInt(txtEdad.getText());
                        p = new Persona(nombre, edad);
                        javax.swing.JOptionPane.showMessageDialog(JVentana.this, "Persona creada");
                    }
                    catch(NumberFormatException nfe)
                    {
                        javax.swing.JOptionPane.showMessageDialog(JVentana.this, "Error, la edad debe ser numérica");
                        txtEdad.requestFocus();
                        txtEdad.selectAll();
                    }
                    
                }
            });

        this.addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent e)
                {
                    System.out.println(p);
                }
            });


        JLabel lblNombre = new JLabel("Nombre: ");
        JLabel lblEdad = new JLabel("Edad: ");

        txtNombre = new JTextField(10);
        txtEdad = new JTextField(10);

        pnlCentro.add(lblNombre);
        pnlCentro.add(txtNombre);
        pnlCentro.add(lblEdad);
        pnlCentro.add(txtEdad);
        pnlCentro.add(btnAceptar);
        pnlCentro.add(btnCancelar);

        pnlSur.add(new JLabel("v1.0"));
        JLabel lblBy = new JLabel("by DCB");
        lblBy.setHorizontalAlignment(JLabel.RIGHT); //Alineación a la derecha
        pnlSur.add(lblBy);


        this.setLayout(new BorderLayout());
        this.add(pnlNorte, BorderLayout.NORTH);
        this.add(pnlCentro, BorderLayout.CENTER);
        this.add(pnlSur, BorderLayout.SOUTH);
        
        //this.setTitle("Mi primera Ventana");
        //this.setSize(330, 200);
        this.pack();
        this.setResizable(false);
        //this.setLocation(333,333);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para que al pulsar en la X finalice la aplicación
        //Este método siempre debe ser el último mensaje
        this.setVisible(true);
	}
}


/*
setMinimumSize()
setMaximumSize()
setPreferedSize()
*/

/*
JDialog
JWindow
JFrame
*/