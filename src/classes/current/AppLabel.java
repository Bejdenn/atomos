package main;

import java.awt.Color;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class AppLabel extends JLabel {

	private int x;
	private int y;
	private int breite;
	private int hoehe;

	public static final String HTMLBEGIN = "<html>";
	public static final String HTMLEND = "</html>";

	public AppLabel(String t, int xCoord, int yCoord, int b, int h) {
		super(HTMLBEGIN + t + HTMLEND);
		this.x = xCoord;
		this.y = yCoord;
		this.breite = b;
		this.hoehe = h;

		this.setForeground(AppColor.GRAU);
		this.setFont(AppFont.FONT_BOLD);
		this.setBounds(x, y, breite, hoehe);
	}

	public AppLabel(String t, int xCoord, int yCoord, int b, int h, Color c) {
		this(t, xCoord, yCoord, b, h);
		this.setForeground(AppColor.GRAU);
	}


}
