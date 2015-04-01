package progetto;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class ZonaGiocatori extends JPanel {
	
	public ZonaGiocatori(){
		this.setLayout(new GridLayout(2, 1));
		this.add(new Giocatore1());
		this.add(new Giocatore2());
		
	}
	
	

}