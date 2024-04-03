import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Fondo extends JPanel{
    Image fondo;
    Mario mario;

    final static int ancho = 640;
    final static int largo = 400;

    Fondo()
    {
        super();
        try{
            fondo = ImageIO.read(new File("background.png"));
            mario = new Mario();
        }catch(IOException e){
            e.printStackTrace();
            System.exit(-5);
        }
        // this.setFocusable(true);
        // this.requestFocusInWindow();
        this.setPreferredSize(new Dimension(fondo.getWidth(null),fondo.getHeight(null)));
        this.addKeyListener(new KeyAdapter() {
           

            @Override
            public void keyPressed(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_LEFT)
                {
                    mario.moverX(-10);
                }else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
                {
                    mario.moverX(10);
                }  
                Fondo.this.repaint();
            }

           

            
        });
    
    
    }

    

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(fondo,0,0,null);
        mario.paint(g);
    }

}