package projet;

import javax.swing.*;
import java.awt.*;


public class FenetreMere extends JFrame
{
	public FenetreMere (String parTitre)
	{
		super (parTitre);
		//PanelCalendrier contentPane = new PanelCalendrier();
		PanelFils contentPane = new PanelFils();
		setContentPane (contentPane);
		setBackground(new Color(230,67,98));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setSize(750,350); 
		pack();
		setVisible(true); setLocationRelativeTo(null);
		//testtesttest
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println ("premier programme avec eclipse!");
		new FenetreMere("Titre");
		
	}

}