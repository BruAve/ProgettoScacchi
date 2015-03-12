package base;
//importo tutte le librerie necessarie.
import java.awt.*;

import javax.swing.*;
public class Scacchiera extends JComponent {
	private static final long serialVersionUID = 2375810646479149663L;
	private final Image scacchiera;
	
	public Scacchiera() {
		scacchiera=new ImageIcon("../progettoScacchi/immagini/scacchiera.png").getImage();
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(600, 600);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		if(scacchiera==null)
			return;
		
		g.drawImage(scacchiera, 0, 0, null);
	}
	
	
}

 
