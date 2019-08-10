package main;

import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class AppSeparator extends JSeparator {
	
	private int x;
	private int y;
	private int breite;
	private int hoehe;
	private AppColor color;
	
	public AppSeparator(int xCoord, int yCoord, int b, int h) {
		this.x = xCoord;
		this.y = yCoord;
		this.breite = b;
		this.hoehe = h;
		this.setBounds(x, y, breite, hoehe);
		this.setBackground(AppColor.GRAU);
	}
}
