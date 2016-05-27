package projet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PanelFils extends JPanel {

	public JPanel panCentre = new JPanel();
	public JPanel panOuest = new JPanel();
	public JPanel panNord = new JPanel();
	public JScrollPane scroll = new JScrollPane();
	
	
	public PanelFils(){
		setBackground(Color.decode("#A2B5BF"));
		setLayout(new BorderLayout());
		
		scroll.setPreferredSize(new Dimension(500,150));

		//panNord.add(table);
		
		panNord.add(scroll);
		
		
		//test du commit erhiozhefou
		add(panOuest,BorderLayout.WEST);
		add(panCentre,BorderLayout.CENTER);
		add(panNord,BorderLayout.NORTH);
	}

	
}
