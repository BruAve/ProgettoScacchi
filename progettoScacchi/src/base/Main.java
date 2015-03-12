package base;
import java.awt.*;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {	
			public void run() {
				JFrame gioco = new GiocoScacchi();
				gioco.setSize(1000, 650);
				gioco.setVisible(true);
				gioco.setTitle("Scacchi");
				gioco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
			}
		});
	}
} 
