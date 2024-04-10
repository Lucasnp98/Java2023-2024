import javax.swing.JPanel;

public class PelotaHilos implements Runnable{
    
private Pelota pelota;
private JPanel componente;
public PelotaHilos(Pelota unapelota, JPanel uncomponente)
{
this.pelota = unapelota;
this.componente = uncomponente;
}

@Override
public void run()
{
    for (int i=1; i<=3000; i++){
				
                
                
        pelota.mueve_pelota(componente.getBounds());
        //Este método pinta la pelota en cada iteración, repinta la lámina
        componente.paint(componente.getGraphics());
        try{
        Thread.sleep(1);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
}
