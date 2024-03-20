
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
public class MiBoton extends JButton{
    public MiBoton(String texto, Font fuente)
    {
        super(texto);
        this.setForeground(Color.WHITE);
        this.setBackground(Color.BLACK);
        this.setFont(fuente);
    }
}