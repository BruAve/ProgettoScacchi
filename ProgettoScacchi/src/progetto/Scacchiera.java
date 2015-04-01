package progetto;

//importo tutte le librerie necessarie.
import java.awt.*;

import javax.swing.*;
public class Scacchiera extends JComponent {
	private static final long serialVersionUID = 2375810646479149663L;
	private final Image scacchiera;
	private final Image torreBianca;
	private final Image cavalloBianco;
	private final Image alfiereBianco;
	private final Image reBianco;
	private final Image reginaBianca;
	private final Image pedinaBianca;
	private final Image torreNera;
	private final Image cavalloNero;
	private final Image alfiereNero;
	private final Image reNero;
	private final Image reginaNera;
	private final Image pedinaNera;
	
	public Scacchiera() {
		scacchiera=new ImageIcon("../ProgettoScacchi/immagini/scacchiera.png").getImage();
		torreBianca=new ImageIcon("../ProgettoScacchi/immagini/scacchiBianchi/TorreBianca.png").getImage();
		cavalloBianco=new ImageIcon("../ProgettoScacchi/immagini/scacchiBianchi/CavalloBianco.png").getImage();
		alfiereBianco=new ImageIcon("../ProgettoScacchi/immagini/scacchiBianchi/AlfiereBianco.png").getImage();
		reBianco=new ImageIcon("../ProgettoScacchi/immagini/scacchiBianchi/ReBianco.png").getImage();
		reginaBianca=new ImageIcon("../ProgettoScacchi/immagini/scacchiBianchi/ReginaBianca.png").getImage();
		pedinaBianca=new ImageIcon("../ProgettoScacchi/immagini/scacchiBianchi/PedinaBianca.png").getImage();
		torreNera=new ImageIcon("../ProgettoScacchi/immagini/scacchiNeri/TorreNera.png").getImage();
		cavalloNero=new ImageIcon("../ProgettoScacchi/immagini/scacchiNeri/CavalloNero.png").getImage();
		alfiereNero=new ImageIcon("../ProgettoScacchi/immagini/scacchiNeri/AlfiereNero.png").getImage();
		reNero=new ImageIcon("../ProgettoScacchi/immagini/scacchiNeri/ReNero.png").getImage();
		reginaNera=new ImageIcon("../ProgettoScacchi/immagini/scacchiNeri/ReginaNera.png").getImage();
		pedinaNera=new ImageIcon("../ProgettoScacchi/immagini/scacchiNeri/PedinaNera.png").getImage();
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(600, 600);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		if(scacchiera==null)
			return;
		
		g.drawImage(scacchiera, 0, 0, null);
		g.drawImage(torreNera,18,18,null);
		g.drawImage(cavalloNero,89,18,null);
		g.drawImage(alfiereNero,160,18,null);
		g.drawImage(reginaNera,231,18,null);
		g.drawImage(reNero,302,18,null);
		g.drawImage(alfiereNero,373,18,null);
		g.drawImage(cavalloNero,444,18,null);
		g.drawImage(torreNera,515,18,null);
		int k = 18;
		for (int i=0;i<8;i++){
			g.drawImage(pedinaNera,k,89,null);
			k = k + 71;
		}
		g.drawImage(torreBianca,18,515,null);
		g.drawImage(cavalloBianco,89,515,null);
		g.drawImage(alfiereBianco,160,515,null);
		g.drawImage(reginaBianca,231,515,null);
		g.drawImage(reBianco,302,515,null);
		g.drawImage(alfiereBianco,373,515,null);
		g.drawImage(cavalloBianco,444,515,null);
		g.drawImage(torreBianca,515,515,null);
		k = 18;
		for (int i=0;i<8;i++){
			g.drawImage(pedinaBianca,k,444,null);
			k = k + 71;
		}
		
		
	}
	
	
}