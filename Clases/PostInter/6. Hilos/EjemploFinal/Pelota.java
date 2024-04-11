import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

class Pelota{

    private static final int TAMX=15;
	
	private static final int TAMY=15;
	
	private double x=0;
	
	private double y=0;
	
	private double dx=1;
	
	private double dy=1;
	
	// Mueve la pelota invirtiendo posici�n si choca con l�mites
	
	public void mueve_pelota(Rectangle2D limites){
		// Hago que la pelota se mueva hacia un lado o hacia otro en función de si ha llegado a un x / y
        // Si llega a un limite, invierto la x o la y para que se mueva en dirección opuesta
        //Recibo un Rectangle que tiene metodos getX y getY, mirar en la api
        //Lo que recibe son las dimensiones de la lámina y podemos controlar hacia donde se mueve

        //Incremento coord x e y, haciendo q la pelota se mueva
		this.x+=dx;
		
		this.y+=dy;

        //Con estos condicionales soy capaz de detectar lo límites e invierto la dirección de la pelota
		
		if(x<limites.getMinX()){
			
			x=limites.getMinX();
			
			dx=-dx;
		}
		
		if(x + TAMX>=limites.getMaxX()){
			
			x=limites.getMaxX() - TAMX;
			
			dx=-dx;
		}
		
		if(y<limites.getMinY()){
			
			y=limites.getMinY();
			
			dy=-dy;
		}
		
		if(y + TAMY>=limites.getMaxY()){
			
			y=limites.getMaxY()-TAMY;
			
			dy=-dy;
			
		}
		
	}
	
	//Forma de la pelota en su posici�n inicial
	
	public Ellipse2D getShape(){
		
		return new Ellipse2D.Double(x,y,TAMX,TAMY);
		
	}	
	
	
	
	
}
