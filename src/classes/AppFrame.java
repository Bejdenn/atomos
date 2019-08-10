package main;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class AppFrame extends JFrame {

	private int breite;
	private int hoehe;
	public final double b = Toolkit.getDefaultToolkit().getScreenSize().width * 0.75;
	public final double h = Toolkit.getDefaultToolkit().getScreenSize().height * 0.75;

	public AppFrame() {
		this.breite = (int) b;
		this.hoehe = (int) h;
		this.setSize(breite, hoehe);
		this.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - breite) / 2,
				(Toolkit.getDefaultToolkit().getScreenSize().height - hoehe) / 2);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(null);
	}
}
