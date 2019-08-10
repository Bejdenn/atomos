package main;

import static javax.swing.BorderFactory.createLineBorder;

import java.awt.Color;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AppPanel extends JPanel {
	
	private int x;
	private int y;
	private int breite;
	private int hoehe;
	private final int borderSize = 4;
	
	public AppPanel(int xCoord, int yCoord, int b, int h, Color c) {
		this.x = xCoord;
		this.y = yCoord;
		this.breite = b;
		this.hoehe = h;
		
		this.setBounds(x, y, breite, hoehe);
	    this.setBorder(createLineBorder(new Color(100, 100, 100), borderSize));
	    this.setBackground(c);        
	    this.setLayout(null);
	}
}
