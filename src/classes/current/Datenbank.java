package main;

import java.util.ArrayList;

public class Datenbank {

	private SQLite.Database db;
	public final int lehrerID = 1;

	public Datenbank() {
		
	}

	public <T> ArrayList<T> datenAbfragen(String query) {
		db = new SQLite.Database("PS");
		ArrayList<T> wert;
		try {
			wert = db.accessData(query, 1);
		} catch (Exception ex) {
			wert = null;
		}
		db.close();
		return wert;
	}

	public void befehlAusfuehren(String befehl) {
		db = new SQLite.Database("PS");
		db.executeOrder(befehl);
		db.close();
	}
}
