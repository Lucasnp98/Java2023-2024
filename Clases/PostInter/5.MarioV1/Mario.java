import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Mario extends Sprite{

    private static final int X_INICIAL = 20;
    private static final int Y_INICIAL = 450;
    private static final int VELOCIDAD = 20;
    private static final int  ANCHO_INICIAL = 40;
    Image icono;

    public Mario() throws IOException
    {
        super(X_INICIAL, Y_INICIAL, VELOCIDAD);
        icono = leerImagen("idle.png");
    }
    private Image leerImagen(String path) throws IOException{
        return ImageIO.read(new File(path)).getScaledInstance(-1, ANCHO_INICIAL, Image.SCALE_SMOOTH);
    }

    public void paint(Graphics g)
    {
        g.drawImage(icono, this.x, this.y, null);
    }
    public void moverX(int x)
    {
        if(this.x + x > 0 && this.x + x < 400)//this.x + x < 500 && this.x + x > 0)
        {
        
        this.x += x;
        }
    }

    public void moverY(int y)
    {
        this.y += y;
    }




    
}