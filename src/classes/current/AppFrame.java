package main;
 
import java.awt.Component;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class AppFrame extends JFrame {

	private int breite;
	private int hoehe;
	private final double x = Toolkit.getDefaultToolkit().getScreenSize().width * 0.75;
	private final double y = Toolkit.getDefaultToolkit().getScreenSize().height * 0.75;
	
	public AppFrame() {
		this.breite = (int) x;
		this.hoehe = (int) y;
		this.setSize(breite, hoehe);
		this.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - breite) / 2,
				(Toolkit.getDefaultToolkit().getScreenSize().height - hoehe) / 2);
		this.setResizable(false);
		this.setUndecorated(true);
		this.getContentPane().setBackground(AppColor.DUNKELBLAU);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(null);
		AppPanel closePanel = new AppPanel(this.getBreite() - 30, 0, 30, 30, AppColor.ROSA);
		closePanel.add(new AppLabel("X", 0, 0, 35, 35, AppColor.GRAU));
		closePanel.addFunction("Terminate");
		this.add(closePanel);
	}
	
	@SuppressWarnings("unchecked")
	public <T> void addComponentList(List<T> list) {
		List<Component> changedList = new ArrayList<Component>();
		changedList.addAll(0, (List<Component>) list);
		for (int i = 0; i < list.size(); i++) {
			this.add(changedList.get(i));
		}
	}

	public int getBreite() {
		return breite;
	}

	public int getHoehe() {
		return hoehe;
	}

	public int getX() {
		return (int) x;
	}

	public int getY() {
		return (int) y;
	}

}
