package key;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.Color;

/*
Q1: �Qu� diferencia existe entre keyPressed y keyTyped a la hora de tomar el valor de las teclas?
Q2: �Qu� son los atributos VK_xxxx definidos en KeyEvent?
Q3: �Qu� hace el m�todo requestFocus() de Component?

*/


public class JVentana2 extends JFrame
{
    private JButton btnAceptar;
    private JButton btnCancelar;

    public static void main(String[] args)
    {
        new JVentana2();
    }

	public JVentana2()
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

        btnAceptar.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    System.out.println("Bot�n pulsado Aceptar");
                }
            });

        btnCancelar.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    System.out.println("Bot�n pulsado Cancelar");
                }
            });

        //this.addWindowListener(this);
        //this as JFrame.recibe eventos de Ventana que gestionar�(this as WindowListener);

        this.addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent e)   
                {
                    System.out.println("Desea realmente cerrar la aplicaci�n");
                    JVentana2.this.dispose();
                    System.exit(0);
                }
            });

        txtNombre.addKeyListener(new KeyAdapter()
        	{
        		//Cualquier tecla
                @Override
                public void keyPressed(KeyEvent e)   
                {
                	int code = e.getKeyCode();
                	if(code == KeyEvent.VK_ENTER)
                		txtEdad.requestFocus();

                    System.out.println("Pressed:" + e.getKeyCode() + "-" + e.getKeyChar());
                }

        		@Override
                public void keyTyped(KeyEvent e)   
                {
                    System.out.println("Typed: " + e.getKeyCode() + "-" + e.getKeyChar());
                }                
        	});

        this.setLayout(new BorderLayout()); //JFrame
        this.add(pnlNorte, BorderLayout.NORTH);
        this.add(pnlCentro, BorderLayout.CENTER);
        this.add(pnlSur, BorderLayout.SOUTH);
        
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Para que al pulsar en la X finalice la aplicaci�n
        //Este m�todo siempre debe ser el �ltimo mensaje
        this.setVisible(true);
	}

}