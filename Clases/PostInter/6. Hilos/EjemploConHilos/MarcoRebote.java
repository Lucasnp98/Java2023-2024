import java.awt.geom.*;

import javax.swing.*;
import Thread;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class MarcoRebote extends JFrame{
    private LaminaPelota lamina;
	
	public MarcoRebote(){
		
		this.setBounds(600,300,400,350);
		
		this.setTitle ("Rebotes");
		//Añadimos botones y láminas
		lamina=new LaminaPelota();
		
		this.add(lamina, BorderLayout.CENTER);
		
		JPanel laminaBotones=new JPanel();
		//Añadimos los botones a la lamina de botones a traves del método ponerBoton
		this.ponerBoton(laminaBotones, "Dale!", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				comienza_el_juego();
			}
			
		});
		
		
		this.ponerBoton(laminaBotones, "Salir", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				System.exit(0);
				
			}
			
		});
		
		this.add(laminaBotones, BorderLayout.SOUTH);
	}
	
	
	//Ponemos botones
	//Este método recibe el lugar donde quiero añadir el boton, el nombre del boton y su evento
	public void ponerBoton(Container c, String titulo, ActionListener oyente){
		
		JButton boton=new JButton(titulo);
		
		c.add(boton);
		
		boton.addActionListener(oyente);
		
	}
	
	//Método que hace que comience el juego
	
	public void comienza_el_juego (){
		
					
			Pelota pelota=new Pelota();
			
			//ESTA PRIMERA APROXIMACIÓN ES UNA MALA PRÁCTICA, PODEMOS GESTIONAR TODO CON UN SOLO HILO
			//NOS SIRVE COMO PRIMER EJEMPLO PARA ENTENDER LOS HILOS
			lamina.add(pelota);
			PelotaHilos p = new PelotaHilos(pelota, lamina);
			Thread hilo =  new Thread(p);
			hilo.start();
			//Creamos una pelota y la añadimos a nuestra LaminaPelota, acto seguido hacemos que la pelota se mueva 
            //y se pinte dentro de un bucle que se repite 3000 veces.
			
			
		
		
	}
	
	
	
	
}
