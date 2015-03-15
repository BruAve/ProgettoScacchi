package base;
import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class GiocoScacchi extends JFrame {
	private static final long serialVersionUID = 5453533880780430476L;
	
	public GiocoScacchi(){	
		add(new Scacchiera(), BorderLayout.WEST);
		add(new ZonaGiocatori(), BorderLayout.CENTER);
		pack();
	}
}