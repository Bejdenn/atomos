package main;

import main.AppPanel;

public class AppSystemButtons extends AppPanel {

	public AppSystemButtons() {
		super();
	}
	
	public AppSystemButtons(String type, int xCoord, int yCoord) {
		AppPanel closePanel = new AppPanel(xCoord, yCoord, 40, 40, AppColor.GRAU);
		switch(type) {
		case "Terminate":
			closePanel.addFunction("Terminate");
		}
	}
}
