import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.Color;

public class JVentana extends JFrame implements ActionListener
{
    JButton btnAceptar;
    JButton btnCancelar;

    public static void main(String[] args)
    {
        new JVentana();
    }

	public JVentana()
	{
        super("Personas");

        JPanel pnlNorte = new JPanel(new FlowLayout());
        JPanel pnlCentro = new JPanel(new GridLayout(3, 2));
        JPanel pnlSur = new JPanel(new GridLayout(1, 2));

        JLabel lblTitulo = new JLabel("Gesti�n de Personas");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitulo.setForeground(new Color(112, 146, 190));
        pnlNorte.add(lblTitulo);

        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");

        JLabel lblNombre = new JLabel("Nombre: ");
        JLabel lblEdad = new JLabel("Edad: ");

        JTextField txtNombre = new JTextField(12);
        JTextField txtEdad = new JTextField(12); //Caracteres

        pnlCentro.add(lblNombre);
        pnlCentro.add(txtNombre);
        pnlCentro.add(lblEdad);
        pnlCentro.add(txtEdad);
        pnlCentro.add(btnAceptar);
        pnlCentro.add(btnCancelar);

        pnlSur.add(new JLabel("v1.0"));
        JLabel lblBy = new JLabel("by DCB");
        lblBy.setHorizontalAlignment(JLabel.RIGHT); //Alineaci�n a la derecha
        pnlSur.add(lblBy);

        btnAceptar.addActionListener(this); //ActionLister
        btnCancelar.addActionListener(this); //ActionLister

        this.setLayout(new BorderLayout()); //JFrame
        this.add(pnlNorte, BorderLayout.NORTH);
        this.add(pnlCentro, BorderLayout.CENTER);
        this.add(pnlSur, BorderLayout.SOUTH);
        
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para que al pulsar en la X finalice la aplicaci�n
        //Este m�todo siempre debe ser el �ltimo mensaje
        this.setVisible(true);
	}


    

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnAceptar)
            System.out.println("Hola estoy pulsando un boton");
        else if(e.getSource()==btnCancelar)
            System.out.println("Bot�n pulsado Cancelar");
    }
}