import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

// Este es el panel que va a contener las pelotas que van  moverse
public class LaminaPelota extends JPanel{
	
	
    private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
	//método que va a ir añadiendo las pelotas al arraylist
	public void add(Pelota b){
		
		pelotas.add(b);
	}
	
    //Simplemente  hacemos override del paintcomponente para pintar la pelota
    //Este código pinta una pelota, hay muchas maneras, nos da igual cómo lo haga
    @Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
		for(Pelota b: pelotas){
			
			g2.fill(b.getShape());
		}
		
	}
	
	
}