package main;
 
import java.awt.Component;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;
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
		this.getContentPane().setBackground(AppColor.BLAU);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(null);
	}
	
	public <T> void addComponentList(List<T> list) {
		List<Component> changedList = new ArrayList<Component>();
		changedList.addAll(0, (List<Component>) list);
		for (int i = 0; i < list.size(); i++) {
			this.add(changedList.get(i));
		}
	}
}
