package base;
//importo tutte le librerie necessarie.
import java.awt.*;

import javax.swing.*;
public class Scacchiera extends JPanel {
	private static final long serialVersionUID = 2375810646479149663L;
	JButton BScacchiera = new JButton(new ImageIcon("C:/Users/Ave/workspace/progettoSc/immagini/scacchiera.png"));
	JPanel Gioco = new JPanel();
	public Scacchiera() {
		BScacchiera.setContentAreaFilled(false);
		BScacchiera.setBorderPainted(false);
		BScacchiera.setPreferredSize(new Dimension(600,600));
		Gioco.add(BScacchiera);
		add(Gioco);

		
	}
}

 
