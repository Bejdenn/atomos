package main;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AppPanel extends JPanel {
	
	private int x;
	private int y;
	private int breite;
	private int hoehe;
	
	public AppPanel (int xCoord, int yCoord, int b, int h, Color c) {
		this.x = xCoord;
		this.y = yCoord;
		this.breite = b;
		this.hoehe = h;
		
		this.setBounds(x, y, breite, hoehe);
	    this.setBackground(c);        
	    this.setLayout(null);
	}
	
	public void addFunction(String func) {
		switch(func) {
			case "Terminate":
				this.addMouseListener(new MouseAdapter() 
				{
					@Override
					public void mouseClicked(MouseEvent e) {
						try {
							System.exit(0);
						} catch (Exception ex) {
							
						}
					}
				});
			break;
		}
	}
}
